package com.web.service;

import java.util.List;

import com.web.entity.Worktime;

public interface WorkTimeService {

	//查询所有信息
	List<Worktime> queryWorkTimeInfo();

	//根据主键查询
	Worktime queryWorkTimeById(Integer wkid);

	//根据id修改
	Integer updateWorkTimeById(Worktime worktime);

	//添加WorkTime
	Integer addWorkTime(Worktime worktime);
 
}
