package com.web.service;

import java.util.List;

import com.web.entity.Chargestatus;

public interface ChargeStatusService {

	//查询所有
	List<Chargestatus> queryAllChargeStatus();

	//根据id查询
	Chargestatus getChargeStatusById(Integer chargestatusid);

	//根据id修改
	Integer updateChargeStatusById(Chargestatus chargestatus);

	//添加薪资
	Integer addChargestatus(Chargestatus chargestatus);

}
