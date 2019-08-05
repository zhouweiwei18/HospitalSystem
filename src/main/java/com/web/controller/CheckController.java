package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Check;
import com.web.service.CheckService;

@Controller
@RequestMapping("/check")
public class CheckController {

	@Resource
	CheckService checkService;

	@RequestMapping("/getAllInfo")
	@ResponseBody
	public List<Check> getAllInfo() {

		return checkService.queryAll();
	}

	@RequestMapping("/addCheck")
	@ResponseBody
	public Integer addCheck(Check check) {
		
		Integer i = checkService.addCheck(check);
		
		return i;
	}

}
