package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.IcuMapper;
import com.web.entity.Icu;
import com.web.service.IcuService;

@Service
public class IcuServiceImpl implements IcuService {

	@Autowired
	IcuMapper icuMapper;

	@Override
	public List<Icu> getAllIcu() {

		List<Icu> list = icuMapper.selectIcuInfo();

		List<Icu> iList = new ArrayList<Icu>();

		for (Icu icu : list) {
			if (icu.getIsdelete() == 0) {
				iList.add(icu);
			}
		}
		return iList;
	}

	@Override
	public Icu getIcuById(Integer icuid) {

		return icuMapper.selectByPrimaryKey(icuid);
	}

	@Override
	public Integer updateIcu(Icu icu) {

		return icuMapper.updateByPrimaryKeySelective(icu);
	}

	@Override
	public Integer deleteById(Icu icu) {

		return icuMapper.updateByPrimaryKeySelective(icu);
	}

	@Override
	public Integer addIcu(Icu icu) {

		return icuMapper.insert(icu);
	}

}
