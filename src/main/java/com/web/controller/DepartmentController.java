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

	
	@RequestMapping("/getAllDepartment")
	@ResponseBody
	public List<Department> getAllDepartment() {
		
		List<Department> list = departmentService.getDeparments();
		
		if (list == null) {
			return new ArrayList<Department>();
		}
		
		return list;
		
	}

}
