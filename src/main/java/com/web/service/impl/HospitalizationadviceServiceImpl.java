package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.HospitalizationadviceMapper;
import com.web.entity.Hospitalizationadvice;
import com.web.entity.HospitalizationadviceExample;
import com.web.service.HospitalizationadviceService;

@Service
public class HospitalizationadviceServiceImpl implements HospitalizationadviceService {

	@Autowired
	HospitalizationadviceMapper hospitalizationadviceMapper;
	
	@Override
	public List<Hospitalizationadvice> queryAllHospitalizationadvice(HospitalizationadviceExample example) {

		return hospitalizationadviceMapper.selectByExample(example);
	}

	@Override
	public List<Hospitalizationadvice> queryPatientUser() {
		
		return hospitalizationadviceMapper.queryPatientUser();
	}

	@Override
	public Hospitalizationadvice selectByPrimaryKey(Integer hid) {
		
		return hospitalizationadviceMapper.selectByPrimaryKey(hid);
	}

	@Override
	public Integer updateHospitalizationadviceById(Hospitalizationadvice hospitalizationadvice) {
		
		return hospitalizationadviceMapper.updateByPrimaryKeySelective(hospitalizationadvice);
	}

	@Override
	public Integer insertHospitalizationadvice(Hospitalizationadvice hospitalizationadvice) {
	
		return hospitalizationadviceMapper.insertSelective(hospitalizationadvice);
	}

	@Override
	public Integer getHospitalizationadviceId(Integer hospitalizationid) {
		
		HospitalizationadviceExample example = new HospitalizationadviceExample();
		example.createCriteria().andHospitalizationidEqualTo(hospitalizationid);
		
		List<Hospitalizationadvice> list = hospitalizationadviceMapper.selectByExample(example);
		return list != null ? list.get(0).getHospitalizationadviceid() : -1;
	}


}
