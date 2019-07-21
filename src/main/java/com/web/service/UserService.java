package com.web.service;

import java.util.List;

import com.web.entity.User;
import com.web.entity.UserExample;

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
}
