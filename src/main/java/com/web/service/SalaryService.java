package com.web.service;

import java.util.List;

import com.web.entity.Salary;

public interface SalaryService {

	//查询所有
	List<Salary> getSalaryInfo();
 
	//根据id删除
	int delSalaryById(Salary salary);

	//根据id查询
	Salary getSalaryById(Integer salaryid);

	//添加salary
	int addSalary(Salary salary);

	int updateSalary(Salary salary);

}
