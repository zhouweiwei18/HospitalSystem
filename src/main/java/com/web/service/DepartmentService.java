package com.web.service;

import java.util.List;

import com.web.entity.Department;

public interface DepartmentService {

	
	/**
	 * 查询所有的科室名称
	 * @return
	 */
	List<Department> getDeparments();

	//添加科室
	int addDepartment(Department department);

	//做科室的假删除
	int deleteDepartment(Department d);

	//根据科室id查询某条科室信息
	Department selectDepartmentById(Integer departmentid);

	//根据id修改department某条数据
	Integer updateDepartmentById(Department department);

}
