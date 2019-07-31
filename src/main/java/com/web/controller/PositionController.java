package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Menu;
import com.web.entity.Position;
import com.web.entity.PositionExample;
import com.web.pojo.TreeObj;
import com.web.service.MenuService;
import com.web.service.PositionMenuService;
import com.web.service.PositionService;

@Controller
@RequestMapping("/position")
public class PositionController {

	@Resource
	PositionService positionService;

	@Resource
	MenuService menuService;

	@Resource
	PositionMenuService pms;

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Position p) {

		p.setIsdelete(1);
		// 删除某个User用户(假删除)
		Integer i = positionService.updatePositionById(p);

		return i;
	}

	/**
	 * 下拉列表的全查询
	 * 
	 * @return
	 */
	@RequestMapping("/queryPosition")
	@ResponseBody
	public List<Position> queryPosition() {

		PositionExample pe = new PositionExample();

		return positionService.queryAllPosition(pe);
	}

	/**
	 * 查询position表和department表
	 * 
	 * @return
	 */
	@RequestMapping("/queryPositionDept")
	@ResponseBody
	public List<Position> queryPositionDept() {

		return positionService.queryPositionDept();
	}

	/**
	 * 跳转到分配权限页面
	 * 
	 * @param postNumber
	 * @return
	 */
	@RequestMapping(value = "/sendAuthority")
	@ResponseBody
	public List<TreeObj> sendAuthority(Integer postNumber) {

		// 查询所有的菜单
		List<Menu> allMenu = menuService.queryByParentId(null);

		// 根据岗位id查询权限菜单
		List<Integer> ownerList = pms.selectMenuByPoId(postNumber);

		return merge(allMenu, ownerList);
	}

	/**
	 * 匹配权限
	 * 
	 * @param allMenu
	 * @param ownerList
	 * @return
	 */
	public List<TreeObj> merge(List<Menu> allMenu, List<Integer> ownerList) {
		// 实例化集合对象
		List<TreeObj> list = new ArrayList<TreeObj>();

		if (allMenu != null) {
			for (Menu m : allMenu) {

				TreeObj tree = new TreeObj();
				tree.setId(m.getMenuid());
				tree.setName(m.getMenuname());

				// 设置是否选中
				tree.setChecked(hasAuthority(m.getMenuid(), ownerList));

				// 递归子菜单
				tree.setChildren(merge(m.getChildMenu(), ownerList));

				tree.setOpen(true);// true；展开 false:折叠
				tree.setParentTId(m.getParentid());
				tree.setUrl(m.getMenuurl());

				list.add(tree);// 把对象添加到集合中
			}
		}
		return list;
	}

	/**
	 * 判断是否有权限
	 * 
	 * @return
	 */
	public boolean hasAuthority(Integer menuId, List<Integer> ownerList) {

		if (ownerList != null) {
			for (Integer b : ownerList) {
				if (menuId == b) {
					return true;
				}
			}
		}
		return false;
	}

}
