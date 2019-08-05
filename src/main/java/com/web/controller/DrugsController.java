package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Drugs;

import com.web.service.DrugsService;


@Controller
@RequestMapping("/drugs")
public class DrugsController {
	
	
	@Resource
	DrugsService drugsService;
	
	@RequestMapping("/queryDrugs")
	@ResponseBody
	public List<Drugs> getDrugs() {
		
		List<Drugs> list = drugsService.getDrugs();
		
		if (list == null) {
			return new ArrayList<Drugs>();
		}
		
		return list;
	}
	
	


}
