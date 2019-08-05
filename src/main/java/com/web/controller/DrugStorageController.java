package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Drugstorage;
import com.web.service.DrugStorageService;

@RequestMapping("/DrugStorage")
@Controller
public class DrugStorageController {
	
	
	@Autowired
	DrugStorageService drugStorageService;
	
	
	@RequestMapping("/getAllDrugStorage")
	@ResponseBody
	public List<Drugstorage>    getAllDrugStorage(){
		
	return 	drugStorageService.getAllDrugStorage();
		
	}

}
