package com.web.service;

import java.util.List;

import com.web.entity.Check;

public interface CheckService {

	//查询所有信息
	List<Check> queryAll();

	Integer addCheck(Check check);

}
