package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DepartmentMapper;
import com.web.entity.Department;
import com.web.entity.DepartmentExample;
import com.web.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public List<Department> getDeparments() {

		return departmentMapper.selectByExample(new DepartmentExample());

	}

}
