package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PositionmenuMapper;
import com.web.service.PositionMenuService;

@Service
public class PositionMenuServiceImpl implements PositionMenuService {

	@Autowired
	PositionmenuMapper positionmenuMapper;

	@Override
	public List<Integer> selectMenuByPoId(Integer poid) {

		return positionmenuMapper.selctMenuByPoId(poid);
	}

}
