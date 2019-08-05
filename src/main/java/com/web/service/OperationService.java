package com.web.service;

import java.util.List;

import com.web.entity.Bed;
import com.web.entity.Operation;
import com.web.entity.OperationExample;

public interface OperationService {
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Operation> queryAllOperation(OperationExample example);
	
	/**
	 * 关联查询
	 * @return
	 */
	List<Operation> queryPatientUserRoom();
	
	/**
	 * 根据主键查询
	 * @param oid
	 * @return
	 */
	Operation selectByPrimaryKey(Integer oid);
	
	/**
	 * 修改
	 * @param operation
	 * @return
	 */
	Integer updateOperationById(Operation operation);
	
	/**
	 * 添加
	 * @param operation
	 * @return
	 */
	Integer insertOperation(Operation operation);

}
