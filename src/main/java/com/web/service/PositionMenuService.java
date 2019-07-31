package com.web.service;

import java.util.List;

import com.web.entity.Position;

public interface PositionMenuService {

	/**
	 * 根据职位id查询对应菜单id的集合
	 * @param poid
	 * @return
	 */
	List<Integer> selectMenuByPoId(Integer poid);
 
}
