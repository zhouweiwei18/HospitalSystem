package com.web.service;

import java.util.List;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.Hospitallzationfeeitems;
import com.web.entity.HospitallzationfeeitemsExample;

public interface HospitallzationfeeitemsService {
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Hospitallzationfeeitems> queryAll(HospitallzationfeeitemsExample example);
	
	/**
	 * 关联查询
	 * @return
	 */
	List<Hospitallzationfeeitems> queryPatientUser();
	
	/**
	 * 根据主键查询
	 * @param pid
	 * @return
	 */
	Hospitallzationfeeitems selectByPrimaryKey(Integer pid);
	
	/**
	 * 修改
	 * @param hospitallzationfeeitems
	 * @return
	 */
	Integer updateHospitallzationfeeitemsById(Hospitallzationfeeitems hospitallzationfeeitems);
	
	/**
	 * 添加
	 * @param hospitallzationfeeitems
	 * @return
	 */
	Integer insertHospitallzationfeeitems(Hospitallzationfeeitems hospitallzationfeeitems);

}
