package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.HospitalizationprescriptionMapper;
import com.web.entity.Hospitalizationprescription;
import com.web.entity.HospitalizationprescriptionExample;
import com.web.service.HospitalizationprescriptionService;

@Service
public class HospitalizationprescriptionServiceImpl implements HospitalizationprescriptionService {

	@Autowired
	HospitalizationprescriptionMapper hospitalizationprescriptionMapper;
	
	@Override
	public List<Hospitalizationprescription> queryall(HospitalizationprescriptionExample example) {

		return hospitalizationprescriptionMapper.selectByExample(example);
	}

	@Override
	public List<Hospitalizationprescription> querypatientdrugs() {
	
		return hospitalizationprescriptionMapper.querypatientdrugs();
	}

	@Override
	public Hospitalizationprescription selectByPrimaryKey(Integer pid) {
		
		return hospitalizationprescriptionMapper.selectByPrimaryKey(pid);
	}

	@Override
	public Integer updateHospitalizationprescriptionById(Hospitalizationprescription hospitalizationprescription) {
	
		return hospitalizationprescriptionMapper.updateByPrimaryKeySelective(hospitalizationprescription);
	}

	@Override
	public Integer insertHospitalizationprescription(Hospitalizationprescription hospitalizationprescription) {

		return hospitalizationprescriptionMapper.insertSelective(hospitalizationprescription);
	}

}
