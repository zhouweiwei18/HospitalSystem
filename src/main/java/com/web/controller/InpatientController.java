package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Inpatient;
import com.web.entity.InpatientExample;
import com.web.service.InpatientService;

@Controller
@RequestMapping("/inpatient")
public class InpatientController {
	
	@Resource
	InpatientService inpatientservice;
	
	@Resource(name="inpatientServiceImpl")
	InpatientService is;
	
	@RequestMapping("/queryInpatient")
	@ResponseBody
	public List<Inpatient> queryAllInpatient(){
		
		InpatientExample Ie = new InpatientExample();
		
		return inpatientservice.queryAllInpatient(Ie);
	}
	
	@RequestMapping("/queryInpatientDepartment")
	@ResponseBody
	public List<Inpatient> queryInpatientDepartment(){
		
		return inpatientservice.queryInpatientDepartment();
	}
	
	@RequestMapping("/updateInpatient")
	@ResponseBody
	public Inpatient sendUpdate(Integer hid) {
		
		Inpatient inpatient = is.selectByPrimaryKey(hid);
		
		return inpatient;
	}
	
	@RequestMapping("/saveInpatient")
	@ResponseBody
	public Integer saveupdateInpatient(Inpatient inpatient) {
		
		return inpatientservice.updateInpatientById(inpatient);
	}
	
	@RequestMapping("/addInpatient")
	@ResponseBody
	public Integer addInpatient(Inpatient inpatient) {
		
		return inpatientservice.insertInpatient(inpatient);
	}

}
