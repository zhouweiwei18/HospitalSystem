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

}
