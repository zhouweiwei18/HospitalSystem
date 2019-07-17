package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.biz.UserBiz;
import com.web.entity.User;
import com.web.entity.UserExample;

/**
 * 控制层
 * 
 * @author ASUS
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource(name = "userBizImpl") // 注意：首字母应该小写
	UserBiz ub;

	/**
	 * http://localhost:8080/hospitalmanager/user/query.do
	 * 
	 * @ResponseBody:返回的是json数据
	 * @return
	 */
	@RequestMapping(value = "/query")
	@ResponseBody
	public List<User> query() {

		UserExample example = new UserExample();

		// Criteria criteria = example.createCriteria();
		// criteria.andUserNameLike("张%");

		// 查询
		List<User> list = ub.selectByExample(example);

		return list;
	}

}
