package com.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.CheckprojectMapper;
import com.web.entity.Checkproject;
import com.web.entity.CheckprojectExample;
import com.web.service.CheckprojectService;

@Service
public class CheckprojectServiceImpl implements CheckprojectService {

	@Autowired
	CheckprojectMapper checkprojectMapper;

	@Override
	public List<Checkproject> queryAllCheckproject(CheckprojectExample example) {

		return checkprojectMapper.selectByExample(example);
	}

}
