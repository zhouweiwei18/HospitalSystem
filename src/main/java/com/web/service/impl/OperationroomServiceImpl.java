package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.OperationroomMapper;
import com.web.entity.Operationroom;
import com.web.entity.OperationroomExample;
import com.web.service.OperationroomService;

@Service
public class OperationroomServiceImpl implements OperationroomService {

	@Autowired
	OperationroomMapper operationroomMapper;
	
	@Override
	public List<Operationroom> queryAll(OperationroomExample example) {
		
		return operationroomMapper.selectByExample(example);
	}

}
