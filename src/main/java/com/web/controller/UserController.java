package com.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
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
	public  String userRegist(Model model,User user) {
		  // 首先查询用户名是否已经存在
		  List<User> userinfo = userService.selectByName(user.getUsername());
		  //System.out.println(userinfo);
		   if (userinfo != null && userinfo.size() > 0) {
			User a = userinfo.get(0);
			if (a != null) {
				return "";
			}
		}
			// 注册代码
			int isInsert = userService.registUser(user);
		    return "";
	}

}







