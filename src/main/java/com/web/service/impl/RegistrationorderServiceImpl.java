package com.web.service.impl;



import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.dao.RegistrationorderMapper;
import com.web.entity.Medicalrecord;
import com.web.entity.Registrationorder;

import com.web.service.RegistrationorderService;

@Service
public class RegistrationorderServiceImpl implements RegistrationorderService {


	
	@Autowired
	RegistrationorderMapper registrationorderMapper;
	
	
	@Override
	public List<Registrationorder> getRegistrationorder(){
		
		
		List<Registrationorder> list = registrationorderMapper.queryAll();

		ArrayList<Registrationorder> rlist = new ArrayList<Registrationorder>();

		for (Registrationorder r : list) {

			if (r.getRegistrationnumber()== 0 ) {

				rlist.add(r);
			}
		}
		return rlist;
		 
		
		
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

	
	

	@Override
	public Integer deleteRegistrationorderById(Integer registerid) {
		
		return registrationorderMapper.deleteRegistrationorderById(registerid);
		}


}
