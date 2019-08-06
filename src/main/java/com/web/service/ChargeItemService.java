package com.web.service;

import java.util.List;

import com.web.entity.Chargeitem;

public interface ChargeItemService {

	//查询所有信息
	List<Chargeitem> queryAllInfo();
	
	/***
	 * 获取所有
	 * @return
	 */
	List<Chargeitem> getChargeitem();
/**
 * 
 * @param chargeitem
 * @return
 */
	Integer addChargeitem(Chargeitem chargeitem);
/**
 * 
 * @param chargeid
 * @return
 */
	Chargeitem getChargeitemById(Integer id);
/**
 * 
 * @param chargeid
 * @return
 */
	Integer updateChargeitemById(Chargeitem chargeid);

}
