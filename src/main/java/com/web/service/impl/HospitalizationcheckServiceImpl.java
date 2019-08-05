package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.HospitalizationcheckMapper;
import com.web.entity.Hospitalizationcheck;
import com.web.entity.HospitalizationcheckExample;
import com.web.service.HospitalizationcheckService;

@Service
public class HospitalizationcheckServiceImpl implements HospitalizationcheckService {

	@Autowired
	HospitalizationcheckMapper hospitalizationcheckMapper;
	
	@Override
	public List<Hospitalizationcheck> queryAll(HospitalizationcheckExample example) {

		return hospitalizationcheckMapper.selectByExample(example);
	}

	@Override
	public List<Hospitalizationcheck> queryPatientUserCheck() {
		
		return hospitalizationcheckMapper.queryPatientUserCheck();
	}

	@Override
	public Hospitalizationcheck selectByPrimaryKey(Integer hid) {
	
		return hospitalizationcheckMapper.selectByPrimaryKey(hid);
	}

	@Override
	public Integer updateHospitalizationcheckById(Hospitalizationcheck hospitalizationcheck) {
		
		return hospitalizationcheckMapper.updateByPrimaryKeySelective(hospitalizationcheck);
	}

	@Override
	public Integer insertHospitalizationcheck(Hospitalizationcheck hospitalizationcheck) {
	
		return hospitalizationcheckMapper.insertSelective(hospitalizationcheck);
	}

	
}
