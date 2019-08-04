package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.SalaryMapper;
import com.web.entity.Salary;
import com.web.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryMapper salaryMapper;

	@Override
	public List<Salary> getSalaryInfo() {

		List<Salary> list = salaryMapper.queryAllInfo();

		List<Salary> sList = new ArrayList<Salary>();

		for (Salary salary : list) {
			if (salary.getIsdelete() == 0) {
				sList.add(salary);
			}
		}

		return sList;
	}

	@Override
	public int delSalaryById(Salary salary) {

		return salaryMapper.updateByPrimaryKeySelective(salary);
	}

	@Override
	public Salary getSalaryById(Integer salaryid) {

		return salaryMapper.selectByPrimaryKey(salaryid);
	}

	@Override
	public int addSalary(Salary salary) {

		int i = salaryMapper.insert(salary);

		return i;
	}

	@Override
	public int updateSalary(Salary salary) {

		return salaryMapper.updateByPrimaryKeySelective(salary);
	}

}
