package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.ChargeitemMapper;
import com.web.entity.Chargeitem;
import com.web.entity.ChargeitemExample;
import com.web.service.ChargeItemService;

@Service
public class ChargeItemServiceImpl implements ChargeItemService {

	@Autowired
	ChargeitemMapper chargeitemMapper;

	@Override
	public List<Chargeitem> queryAllInfo() {

		ChargeitemExample example = new ChargeitemExample();

		return chargeitemMapper.selectByExample(example);
	}
	
	@Override
	public List<Chargeitem> getChargeitem() {
		
		List<Chargeitem> list= chargeitemMapper.queryAll();
		
		return list;
	}


	@Override
	public Integer addChargeitem(Chargeitem chargeitem) {
		
		return chargeitemMapper.insertSelective(chargeitem);
	}


	@Override
	public Chargeitem getChargeitemById(Integer id) {
		
		return chargeitemMapper.selectByPrimaryKey(id);
	}


	@Override
	public Integer updateChargeitemById(Chargeitem chargeid) {
		
		return chargeitemMapper.updateByPrimaryKeySelective(chargeid);
	}

}
