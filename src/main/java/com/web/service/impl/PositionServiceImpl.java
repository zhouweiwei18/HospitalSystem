package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PositionMapper;
import com.web.entity.Position;
import com.web.entity.PositionExample;
import com.web.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService {
	
	@Autowired
	PositionMapper positionMapper;

	@Override
	public List<Position> queryAllPosition(PositionExample example) {
		
		return positionMapper.selectByExample(example);
	}

}
