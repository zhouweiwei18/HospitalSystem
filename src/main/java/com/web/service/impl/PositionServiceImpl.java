package com.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.PositionMapper;
import com.web.entity.Position;
import com.web.entity.PositionExample;
import com.web.entity.User;
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

		List<Position> list = positionMapper.queryPositionDept();

		List<Position> rList = new ArrayList<Position>();

		// 这里提出所有state状态为1的用户，这些用户已经删除了
		for (Position p : list) {
			if (p.getIsdelete() == 0) {
				rList.add(p);
			}
		}

		return rList;

	}

	@Override
	public Integer updatePositionById(Position p) {

		return positionMapper.updateByPrimaryKeySelective(p);
	}

}
