package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.InpatientMapper;
import com.web.entity.Inpatient;
import com.web.entity.InpatientExample;
import com.web.service.InpatientService;

@Service
public class InpatientServiceImpl implements InpatientService {

	@Autowired
	InpatientMapper inpatientMapper;

	@Override
	public List<Inpatient> queryAllInpatient(InpatientExample example) {

		return inpatientMapper.selectByExample(example);
	}

	@Override
	public List<Inpatient> queryInpatientDepartment() {

		return inpatientMapper.queryInpatientDepartment();
	}

	@Override
	public Inpatient selectByPrimaryKey(Integer hid) {

		return inpatientMapper.selectByPrimaryKey(hid);
	}

	@Override
	public Integer updateInpatientById(Inpatient inpatient) {

		return inpatientMapper.updateByPrimaryKeySelective(inpatient);
	}

	@Override
	public Integer insertInpatient(Inpatient inpatient) {

		return inpatientMapper.insert(inpatient);
	}

	@Override
	public Integer getHospitalizationId(Integer patientid) {

		InpatientExample example = new InpatientExample();
		example.createCriteria().andPatientidEqualTo(patientid);

		List<Inpatient> list = inpatientMapper.selectByExample(example);

		return list != null ? list.get(0).getHospitalizationid() : -1;
	}

}
