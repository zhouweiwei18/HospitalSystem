package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.HospitallzationfeeitemsMapper;
import com.web.entity.Hospitallzationfeeitems;
import com.web.entity.HospitallzationfeeitemsExample;
import com.web.service.HospitallzationfeeitemsService;

@Service
public class HospitallzationfeeitemsServiceImpl implements HospitallzationfeeitemsService {

	@Autowired
	HospitallzationfeeitemsMapper hospitallzationfeeitemsMapper;
	
	@Override
	public List<Hospitallzationfeeitems> queryAll(HospitallzationfeeitemsExample example) {
		
		return hospitallzationfeeitemsMapper.selectByExample(example);
	}

	@Override
	public List<Hospitallzationfeeitems> queryPatientUser() {
		
		return hospitallzationfeeitemsMapper.queryPatientUser();
	}

	@Override
	public Hospitallzationfeeitems selectByPrimaryKey(Integer pid) {
		
		return hospitallzationfeeitemsMapper.selectByPrimaryKey(pid);
	}

	@Override
	public Integer updateHospitallzationfeeitemsById(Hospitallzationfeeitems hospitallzationfeeitems) {

		return hospitallzationfeeitemsMapper.updateByPrimaryKeySelective(hospitallzationfeeitems);
	}

	@Override
	public Integer insertHospitallzationfeeitems(Hospitallzationfeeitems hospitallzationfeeitems) {

		return hospitallzationfeeitemsMapper.insertSelective(hospitallzationfeeitems);
	}

}
