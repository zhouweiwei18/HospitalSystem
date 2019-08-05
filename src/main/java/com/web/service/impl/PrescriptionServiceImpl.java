package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PrescriptionMapper;
import com.web.entity.PrescriptionExample;
import com.web.entity.Medicalrecord;
import com.web.entity.Prescription;
import com.web.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	
	@Autowired
	PrescriptionMapper prescriptionMapper;
	
	
	@Override
	public List<Prescription> getPrescription() {
		
		List<Prescription> list = prescriptionMapper.queryAll();
		
		return list;
	}


	@Override
	public Integer addPrescription(Prescription prescription) {
		
		return prescriptionMapper.insertSelective(prescription);
	}







	

}
