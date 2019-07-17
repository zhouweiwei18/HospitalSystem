package com.web.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.biz.UserBiz;
import com.web.dao.UserMapper;
import com.web.entity.User;
import com.web.entity.UserExample;

/**
 * 业务逻辑层实现类
 * @author ASUS
 *
 */
@Service
public class UserBizImpl implements UserBiz {
	
	/**
	 * 自动配置
	 */
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> selectByExample(UserExample example) {
		
		return userMapper.selectByExample(example);
	}

}
