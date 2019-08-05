package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Hospitallzationfeeitems;
import com.web.entity.HospitallzationfeeitemsExample;
import com.web.service.HospitallzationfeeitemsService;
import com.web.service.InpatientService;

@Controller
public class HospitallzationfeeitemsController {
	
	@Resource
	InpatientService inpatientService;
	
	@Resource(name="hospitallzationfeeitemsServiceImpl")
	HospitallzationfeeitemsService hs;
	
	@Resource
	HospitallzationfeeitemsService hospitallzationfeeitemsService;
	
	@RequestMapping("/queryHospitallzationfeeitems")
	@ResponseBody
	public List<Hospitallzationfeeitems> queryAll(){
		
		HospitallzationfeeitemsExample he = new HospitallzationfeeitemsExample();
		
		return hospitallzationfeeitemsService.queryAll(he);
	}
	
	@RequestMapping("/queryPatientUser")
	@ResponseBody
	public List<Hospitallzationfeeitems> queryPatientUser(){
		
		return hospitallzationfeeitemsService.queryPatientUser();
	}
	
	@RequestMapping("/updateHospitallzationfeeitems")
	@ResponseBody
	public Hospitallzationfeeitems sendUpdateHospitallzationfeeitems(Integer pid) {
		
		Hospitallzationfeeitems hospitallzationfeeitems = hs.selectByPrimaryKey(pid);
		
		return hospitallzationfeeitems;
	}
	
	@RequestMapping("/saveHospitallzationfeeitems")
	@ResponseBody
	public Integer saveUpdateHospitallzationfeeitemsService(Hospitallzationfeeitems hospitallzationfeeitems) {
		
		return hospitallzationfeeitemsService.updateHospitallzationfeeitemsById(hospitallzationfeeitems);
	}
	
	@RequestMapping("/addHospitallzationfeeitems")
	@ResponseBody
	public Integer insertHospitallzationfeeitemsService(Hospitallzationfeeitems hospitallzationfeeitems) {
		
		Integer hosId = inpatientService.getHospitalizationId(hospitallzationfeeitems.getPatient().getPatientid());
		
		if(hosId!=-1) {
			hospitallzationfeeitems.setHospitalizationid(hosId);
		}else {
			hospitallzationfeeitems.setHospitalizationid(0000);
		}
		
		return hospitallzationfeeitemsService.insertHospitallzationfeeitems(hospitallzationfeeitems);
	}

}
