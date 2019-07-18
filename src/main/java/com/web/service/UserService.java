package com.web.service;

import java.util.List;

import com.web.entity.User;
import com.web.entity.UserExample;

public interface UserService {

	List<User> selectAll(UserExample example);
	
	User UserLogin(String username , String userpwd);
	
	List<User> selectByName(String username);
		
	//注册用户
	int  registUser(User user);
	

}
