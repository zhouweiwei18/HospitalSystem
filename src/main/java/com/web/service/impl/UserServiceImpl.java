package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.UserMapper;
import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> selectAll(UserExample example) {

		List<User> list = userMapper.selectByExample(example);

		return list;
	}


}
