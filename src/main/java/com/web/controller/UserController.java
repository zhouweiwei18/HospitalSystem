package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.User;
import com.web.entity.UserExample;
import com.web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	UserService userService;

	@RequestMapping("/getUser")
	@ResponseBody
	public List<User> getUser() {

		UserExample example = new UserExample();

		List<User> list = userService.selectAll(example);

		System.out.println(list.toString());

		return list;
	}

}
