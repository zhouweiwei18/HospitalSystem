package com.web.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.dao.RegistrationorderMapper;
import com.web.entity.Registrationorder;

import com.web.service.RegistrationorderService;

@Service
public class RegistrationorderServiceImpl implements RegistrationorderService {

	@Autowired
	RegistrationorderMapper registrationorderMapper;

	@Override
	public List<Registrationorder> getRegistrationorder() {

		List<Registrationorder> list = registrationorderMapper.queryAll();

		return list;

	}

	@Override
	public Integer addRegistrationorder(Registrationorder registrationorder) {

		return registrationorderMapper.insert(registrationorder);
	}

	@Override
	public Registrationorder getRegistrationorderById(Integer id) {

		return registrationorderMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRegistrationorderById(Registrationorder registerid) {

		return registrationorderMapper.updateByPrimaryKeySelective(registerid);
	}

	public Integer deleteRegistrationorderById(Registrationorder registerid) {

		return registrationorderMapper.updateByPrimaryKey(registerid);
	}

}
