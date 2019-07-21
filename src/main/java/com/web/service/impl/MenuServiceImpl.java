package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.MenuMapper;
import com.web.entity.Menu;
import com.web.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuMapper menuMapper;

	@Override
	public List<Menu> queryByParentId(Integer parentId) {

		// 查询第一层的菜单
		List<Menu> firstMenuList = menuMapper.queryByParentId(parentId);

		execusion(firstMenuList);

		return firstMenuList;
	}

	/**
	 * 递归调用 设置子菜单
	 * 
	 * @param firstMenu
	 */
	private void execusion(List<Menu> firstMenu) {

		if (firstMenu != null) {
			for (Menu menu : firstMenu) {// 对第一层的菜单逐个遍历
				// 第一层的菜单id == 第二层菜单的parentId
				Integer secondParentid = menu.getMenuid();

				List<Menu> secondMenuList = queryByParentId(secondParentid);

				execusion(secondMenuList);

				// 每个菜单集合里面的ChildMenu属性又是一个菜单集合
				// 这里的secondMenuList并不是说仅仅只有两层
				// 可以有很多层，second仅仅是相当于它的上一层而言的
				menu.setChildMenu(secondMenuList);
			}
		}

	}

}
