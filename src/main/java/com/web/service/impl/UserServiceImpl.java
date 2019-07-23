package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.UserMapper;
import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.service.UserService;

@Service
public  class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> selectAll(UserExample example) {

		List<User> list = userMapper.selectByExample(example);

		return list;
	}

	// 用户登录
	public User UserLogin(String username, String userpwd) {
		UserExample userexample = new UserExample();

		userexample.createCriteria().andUsernameEqualTo(username);

		List<User> user = userMapper.selectByExample(userexample);

		if (user.size() != 0) {

			for (User acc : user) {

				if (acc.getUserpwd().equals(userpwd)) {

					return acc;
				}
				// 密码错误
				return null;
			}
		}
		// 用户不存在
		return null;

	}

	/* 根据用户姓名查找 */
	public List<User> selectByName(String username) {
		UserExample userexample = new UserExample();
		userexample.createCriteria().andUsernameEqualTo(username);
		return userMapper.selectByExample(userexample);
	}
	
    //注册用户
	public int  registUser(User user) {
		int u = userMapper.insert(user);
		return u;
	}
	
	


}
