package com.web.service;

import java.util.List;

import com.web.entity.Icu;

public interface IcuService {

	// 查询所有病区信息
	List<Icu> getAllIcu();

	// 根据id查询
	Icu getIcuById(Integer icuid);

	//根据id修改
	Integer updateIcu(Icu icu);

	//做加删除
	Integer deleteById(Icu icu);

	//添加icu数据
	Integer addIcu(Icu icu);

}
