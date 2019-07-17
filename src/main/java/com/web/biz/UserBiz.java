package com.web.biz;

import java.util.List;

import com.web.entity.User;
import com.web.entity.UserExample;

public interface UserBiz {

	/**
	 * 根据条件查询
	 * 
	 * @param example
	 * @return
	 */
	List<User> selectByExample(UserExample example);

}
