package com.web.service;

import java.util.List;

import com.web.entity.Operationroom;
import com.web.entity.OperationroomExample;

public interface OperationroomService {
	
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Operationroom> queryAll(OperationroomExample example);

}
