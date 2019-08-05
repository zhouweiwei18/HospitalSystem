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
	
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Drugs>   getAll(){
	
		return  drugsService.getAll();
	}
	
	@RequestMapping("/getDrugByid")
	@ResponseBody
	public Drugs getDrugByid(Integer drugsid){
		
		return drugsService.getDrugByid(drugsid);
	}
	
	@RequestMapping("/updateDrugs")
	@ResponseBody
	public int  updateDrugs(Drugs drugs){
		
		return drugsService.updateDrugs(drugs);
		
		
	}
	
	@RequestMapping("/insertdrugs")
	@ResponseBody
	public int insertdrugs(Drugs drugs){
		
	return 	drugsService.insertdrugs(drugs);
		
	}
	
	
	@RequestMapping("/delsup")
	@ResponseBody
	public int delsup(Integer drugsid){
		
	 return  drugsService.delsup(drugsid);

	}
	


}
