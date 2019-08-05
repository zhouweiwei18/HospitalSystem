package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.DoctoradviceMapper;
import com.web.entity.Doctoradvice;
import com.web.entity.DoctoradviceExample;
import com.web.service.DoctoradviceService;

@Service
public class DoctoradvceServiceImpl implements DoctoradviceService {

	
	@Autowired
	DoctoradviceMapper doctoradviceMapper;
	@Override
	public List<Doctoradvice> getDoctoradvice() {
	
		return doctoradviceMapper.selectByExample(new DoctoradviceExample());
	}

}
