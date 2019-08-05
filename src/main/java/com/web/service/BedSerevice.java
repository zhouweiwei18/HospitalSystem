package com.web.service;

import java.util.List;

import com.web.entity.Bed;
import com.web.entity.BedExample;
import com.web.entity.Inpatient;

public interface BedSerevice {
	
	/**
	 * 下拉列表查询
	 * @return
	 */
	List<Bed> queryAllBed(BedExample example);
	
	/**
	 * 全查询
	 * @return
	 */
	List<Bed> queryBedUserIcu();
	
	/**
	 * 根据主键查询
	 * @param bid
	 * @return
	 */
	Bed selectByPrimaryKey(Integer bid);
	
	/**
	 * 修改
	 * @param bed
	 * @return
	 */
	Integer updateBedById(Bed bed);
	
	/**
	 * 添加
	 * @param bed
	 * @return
	 */
	Integer insertBed(Bed bed);

}
