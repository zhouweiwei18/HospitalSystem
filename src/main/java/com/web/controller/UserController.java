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

	/* 注册用户 */
	@RequestMapping(value = "/userRegist")
	@ResponseBody
	public String userRegist(User user) {
  
		// 首先查询用户名是否已经存在
		List<User> userinfo = userService.selectByName(user.getUsername());
       
         
         
		if (userinfo != null && userinfo.size() > 0) {
			User us = userinfo.get(0);
			if (us != null) {
				// 说明有重复用户名
				// 返回注册页面，并显示错误信息
				// model.addAttribute("error", "Username Already Exist!");
				//返回重定向
				//return "forward:/user/userlogin";
			}
		}

		// 注册代码
		
		
		int isInsert = userService.registUser(user);
		
		//if (isInsert == 0) { model.addAttribute("error", "Registration failed!"); }
		 
		return "isInsert";		
	}
	
    /*登陆	*/

}
