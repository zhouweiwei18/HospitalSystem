package com.web.service;

import java.util.List;

import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.pojo.UserAndPartment;

public interface UserService {

	/**
	 * 查询所有员工
	 * 
	 * @param example
	 * @return
	 */
	List<User> selectAll(UserExample example);

	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 */
	User login(String userName, String password);
	
	/**
	 * 根据用户的id查询到该用户信息(department)
	 * @param id
	 * @return
	 */
	List<UserAndPartment> getUserAndPart(Integer id);

	/*
	 * User表和Department同时更新
	 */
	int updateUserAndDepartment(UserAndPartment uap);
	
}
