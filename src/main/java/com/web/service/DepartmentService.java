package com.web.service;

import java.util.List;

import com.web.entity.Department;

public interface DepartmentService {

	
	/**
	 * 查询所有的科室名称
	 * @return
	 */
	List<Department> getDeparments();

}
