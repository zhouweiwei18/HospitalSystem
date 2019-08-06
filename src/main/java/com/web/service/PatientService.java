package com.web.service;

import java.util.List;

import com.web.entity.Patient;

public interface PatientService {

	// 查询所有信息
	List<Patient> getSalaryInfo();

	Patient getinfoByid(Integer patientid);

	int updateinfo(Patient patient);

	int delinfo(Integer patientid);

	int addinfo(Patient patient);

}
