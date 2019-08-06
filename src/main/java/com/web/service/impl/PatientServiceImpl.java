package com.web.service.impl;

import java.util.ArrayList;
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

	/*@Override
	public List<Patient> getSalaryInfo() {
		PatientExample example = new PatientExample();

		return patientMapper.selectByExample(example);
	}*/

	// --------------------------------
	@Override
	public List<Patient> getSalaryInfo() {
		
		PatientExample example = new PatientExample();
				
			List<Patient>  list = 	patientMapper.selectByExample(example);
			
			ArrayList<Patient> arrayList = new ArrayList<>();
			
			for (Patient a : list) {
				
				if(a.getIsdelete()==0){
					
					arrayList.add(a);
				}
				
			}
			
			return arrayList;
	}

	@Override
	public Patient getinfoByid(Integer patientid) {
		
		return patientMapper.selectByPrimaryKey(patientid);
	}

	@Override
	public int updateinfo(Patient patient) {
		
		return patientMapper.updateByPrimaryKeySelective(patient);
	}

	@Override
	public int delinfo(Integer patientid) {
		
		return patientMapper.delinfo(patientid);
	}

	@Override
	public int addinfo(Patient patient) {
		
		return patientMapper.insert(patient);
	}

}
