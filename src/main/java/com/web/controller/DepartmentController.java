package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Department;
import com.web.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Resource
	DepartmentService departmentService;

	@RequestMapping("/updateDepartmentById")
	@ResponseBody
	public Integer updateDepartmentById(Department department) {

		Integer i = departmentService.updateDepartmentById(department);

		return i;
	}

	@RequestMapping("/getDepartmentById")
	@ResponseBody
	public Department getDepartmentById(Integer departmentid) {

		Department dept = departmentService.selectDepartmentById(departmentid);

		return dept;
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer departmentid) {

		// 数据的二次封装
		Department d = new Department();
		d.setDepartmentid(departmentid);
		d.setIsdelete(1);

		int i = departmentService.deleteDepartment(d);

		return i;
	}

	@RequestMapping("/addDepartment")
	@ResponseBody
	public Integer addDepartment(Department department) {

		// 数据的二次封装
		department.setIsdelete(0);
		System.out.println(department);

		return departmentService.addDepartment(department);
	}

	@RequestMapping("/queryDepartment")
	@ResponseBody
	public List<Department> getAllDepartment() {

		List<Department> list = departmentService.getDeparments();

		if (list == null) {
			return new ArrayList<Department>();
		}

		return list;
	}

}
