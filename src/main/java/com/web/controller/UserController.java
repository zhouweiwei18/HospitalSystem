package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.web.entity.Menu;
import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.pojo.MenuPojo;
import com.web.service.MenuService;
import com.web.service.PositionMenuService;
import com.web.service.UserService;

@Controller
public class UserController {

	@Resource
	UserService userService;

	@Resource(name = "positionMenuServiceImpl")
	PositionMenuService pms;

	@Resource
	MenuService menuService;

	@RequestMapping("user/getUser")
	@ResponseBody
	public List<User> getUser() {

		UserExample example = new UserExample();

		List<User> list = userService.selectAll(example);

		System.out.println(list.toString());

		return list;
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(String userName, String userPwd, String code, HttpServletRequest req) {

		ModelAndView model = new ModelAndView();

		// 获取Session对象
		HttpSession session = req.getSession();

		// 获取session域中的验证码信息
		String randomCode = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);

		// 判断验证码是否正确
		if (code.equalsIgnoreCase(randomCode)) {

			// 判断用户名和密码是否正确
			User user = userService.login(userName, userPwd);

			System.out.println(user + "------------------------------------------");
			// 判断是否登录成功
			if (user != null) {

				// 得到当前用户的岗位id
				Integer poId = user.getPostid();

				// 根据岗位id查询对应权限菜单
				List<Integer> menuIDs = pms.selectMenuByPoId(poId);

				// 查询所有的菜单
				List<Menu> list = menuService.queryByParentId(null);

				// 匹配权限 什么样的职位id有什么样的菜单
				List<MenuPojo> menuList = merge(menuIDs, list);
				
				for (MenuPojo menuPojo : menuList) {
					System.out.println(menuPojo.toString());
				}
				
				// 传递权限菜单数据到主页面
				model.addObject("menuList", menuList);

				model.setViewName("pages/index");// 跳转到主页面
			} else {

				model.setViewName("login");
			}

		} else {
			model.setViewName("login");
		}

		return model;
	}

	private List<MenuPojo> merge(List<Integer> menuIDs, List<Menu> list) {

		List<MenuPojo> menuPojolist = new ArrayList<>();

		if (list != null) {
			// 遍历所有菜单，找出有权限的菜单
			for (Menu menu : list) {
				// 判断当前的菜单是否有权限
				if (hasAuthority(menu, menuIDs)) {
					MenuPojo mp = new MenuPojo();

					mp.setMenuId(menu.getMenuid());
					mp.setHasAuthority(true);
					mp.setIsDelete(menu.getMenudelete());
					mp.setMenuImage(menu.getMenuimage());
					mp.setMenuLevel(menu.getMenulevel());
					mp.setMenuName(menu.getMenuname());
					mp.setMenuSort(menu.getMenusort());
					mp.setMenuUrl(menu.getMenuurl());
					mp.setParentId(menu.getParentid());

					mp.setChildMenuPojo(merge(menuIDs, menu.getChildMenu()));

					// 把对象添加到集合当中去
					// 这个mp就是有权限的菜单
					menuPojolist.add(mp);// 找到所有的，前端遍历
				}

			}

		}

		return menuPojolist;
	}

	/**
	 * 判断一个菜单是否有权限
	 * 
	 * @param menu
	 * @param menuIDs
	 * @return
	 */
	private boolean hasAuthority(Menu menu, List<Integer> menuIDs) {

		if (menuIDs != null) {
			for (Integer i : menuIDs) {
				if (menu.getMenuid() == i) {
					return true;// 有权限
				}
			}
		}

		return false;// 没有权限
	}

}
