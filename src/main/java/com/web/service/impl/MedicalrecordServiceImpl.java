package com.web.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.dao.MedicalrecordMapper;
import com.web.entity.Medicalrecord;
import com.web.service.MedicalrecordService;

@Service
public class MedicalrecordServiceImpl implements MedicalrecordService {

	
	@Autowired
	MedicalrecordMapper medicalrecordMapper;

	@Override
	public List<Medicalrecord> getMedicalrecord(){
		
		List<Medicalrecord> list =  medicalrecordMapper.queryAll();
				
		
		return list;
	}

	@Override
	public Integer addMedicalrecord(Medicalrecord medicalrecord) {
		
		return medicalrecordMapper.insertSelective(medicalrecord);
	}

	@Override
	public Medicalrecord getMedicalrecordById(Integer id) {
	
		return medicalrecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMedicalRecordById(Medicalrecord medicalrecordid) {
		
		return medicalrecordMapper.updateByPrimaryKeySelective(medicalrecordid);
	}

	
	
	

}
