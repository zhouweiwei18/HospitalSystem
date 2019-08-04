package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Salary;
import com.web.service.SalaryService;

@Controller
@RequestMapping("salary")
public class SalaryController {

	@Resource
	SalaryService salaryService;

	@RequestMapping("/getSalaryById")
	@ResponseBody
	public Salary getSalaryById(Integer salaryid) {

		return salaryService.getSalaryById(salaryid);

	}

	@RequestMapping("/addSalary")
	@ResponseBody
	public Integer addSalary(Salary salary) {

		// 添加isDelete属性
		salary.setIsdelete(0);

		int i = salaryService.addSalary(salary);
		return i;

	}

	@RequestMapping("/updateSalaryById")
	@ResponseBody
	public Integer updateSalaryById(Salary salary) {

		int i = salaryService.updateSalary(salary);
		return i;

	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Salary salary) {

		// 添加isDelete属性
		salary.setIsdelete(1);

		int i = salaryService.delSalaryById(salary);
		return i;

	}

	@RequestMapping("/getAllSalaryInfo")
	@ResponseBody
	public List<Salary> getAllSalaryInfo() {

		List<Salary> list = salaryService.getSalaryInfo();

		return list;
	}

}
