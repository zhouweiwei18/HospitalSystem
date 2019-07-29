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

	/**
	 * 这是position表的单表全查询(下拉列表)
	 */
	@Override
	public List<Position> queryAllPosition(PositionExample example) {
		
		return positionMapper.selectByExample(example);
	}

	@Override
	public List<Position> queryPositionDept() {
		
		return positionMapper.queryPositionDept();
	}

}
