package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DepartmentMapper;
import com.web.entity.Department;
import com.web.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public List<Department> getDeparments() {
		List<Department> list = departmentMapper.selectDepartment();

		List<Department> dList = new ArrayList<Department>();

		// 遍历list，过滤掉所有已经删除的department
		for (Department department : list) {
			if (department.getIsdelete() == 0) {
				dList.add(department);
			}
		}

		return dList;
	}

	@Override
	public int addDepartment(Department department) {

		return departmentMapper.insert(department);
	}

	// 做假删除
	@Override
	public int deleteDepartment(Department d) {
		return departmentMapper.updateByPrimaryKeySelective(d);
	}

	@Override
	public Department selectDepartmentById(Integer departmentid) {

		return departmentMapper.selectByPrimaryKey(departmentid);
	}

	@Override
	public Integer updateDepartmentById(Department department) {

		return departmentMapper.updateByPrimaryKeySelective(department);
	}

}
