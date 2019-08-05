package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.OperationMapper;
import com.web.entity.Operation;
import com.web.entity.OperationExample;
import com.web.service.OperationService;

@Service
public class OperationServiceImpl implements OperationService {

	@Autowired
	OperationMapper operationMapper;
	
	@Override
	public List<Operation> queryAllOperation(OperationExample example) {
		
		return operationMapper.selectByExample(example);
	}

	@Override
	public List<Operation> queryPatientUserRoom() {
		
		return operationMapper.queryPatientUserRoom();
	}

	@Override
	public Operation selectByPrimaryKey(Integer oid) {
		
		return operationMapper.selectByPrimaryKey(oid);
	}

	@Override
	public Integer updateOperationById(Operation operation) {

		return operationMapper.updateByPrimaryKeySelective(operation);
	}

	@Override
	public Integer insertOperation(Operation operation) {

		return operationMapper.insertSelective(operation);
	}

}
