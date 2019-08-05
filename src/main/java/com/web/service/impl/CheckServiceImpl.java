package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.CheckMapper;
import com.web.entity.Check;
import com.web.service.CheckService;

@Service
public class CheckServiceImpl implements CheckService {

	@Autowired
	CheckMapper checkMapper;

	@Override
	public List<Check> queryAll() {

		return checkMapper.selectAllInfo();
	}

	@Override
	public Integer addCheck(Check check) {

		// 二次封装数据
		check.setIsdelete(0);

		int i = checkMapper.insert(check);

		return i;
	}

}
