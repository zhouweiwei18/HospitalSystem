package com.web.service;

import java.util.List;

import com.web.entity.Menu;

public interface MenuService {

	/**
	 * 根据父级id查询对应菜单集合
	 * @param parentId
	 * @return
	 */
	public List<Menu> queryByParentId(Integer parentId);

}
