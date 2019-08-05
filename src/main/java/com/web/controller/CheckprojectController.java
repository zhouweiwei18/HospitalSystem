package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Checkproject;
import com.web.entity.CheckprojectExample;
import com.web.service.CheckprojectService;

@Controller
public class CheckprojectController {
	
	@Resource
	CheckprojectService checkprojectService;
	
	@RequestMapping("/queryCheckproject")
	@ResponseBody
	public List<Checkproject> queryAllCheckproject(){
		
		CheckprojectExample ce = new CheckprojectExample();
		
		return checkprojectService.queryAllCheckproject(ce);
	}

}
