package com.web.service;

import java.util.List;

import com.web.entity.Checkproject;
import com.web.entity.CheckprojectExample;

public interface CheckprojectService {
	
	/**
	 * 下拉全查询
	 * @param checkprojectExample
	 * @return
	 */
	List<Checkproject> queryAllCheckproject(CheckprojectExample example);

}
