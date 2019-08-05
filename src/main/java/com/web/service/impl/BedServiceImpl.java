package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.BedMapper;
import com.web.entity.Bed;
import com.web.entity.BedExample;
import com.web.service.BedSerevice;


@Service
public class BedServiceImpl implements BedSerevice {

	@Autowired
	BedMapper bedMapper;
	
	@Override
	public List<Bed> queryAllBed(BedExample example) {
		
		return bedMapper.selectByExample(example);
	}

	@Override
	public List<Bed> queryBedUserIcu() {
	
		return bedMapper.queryBedUserIcu();
	}

	@Override
	public Bed selectByPrimaryKey(Integer bid) {
	
		return bedMapper.selectByPrimaryKey(bid);
	}

	@Override
	public Integer updateBedById(Bed bed) {

		return bedMapper.updateByPrimaryKeySelective(bed);
	}

	@Override
	public Integer insertBed(Bed bed) {

		return bedMapper.insertSelective(bed);
	}

}
