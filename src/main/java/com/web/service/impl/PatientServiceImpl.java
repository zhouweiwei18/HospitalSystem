package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PatientMapper;
import com.web.entity.Patient;
import com.web.entity.PatientExample;
import com.web.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientMapper patientMapper;

	@Override
	public List<Patient> getSalaryInfo() {
		PatientExample example = new PatientExample();

		return patientMapper.selectByExample(example);
	}

}
