package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Hospitalizationadvice;
import com.web.entity.HospitalizationadviceExample;
import com.web.service.HospitalizationadviceService;
import com.web.service.InpatientService;

@Controller
@RequestMapping("/hospitalizationadvice")
public class HospitalizationadviceController {
	
	@Resource
	HospitalizationadviceService hospitalizationadviceService;
	
	@Resource(name="hospitalizationadviceServiceImpl")
	HospitalizationadviceService hs;
	
	@Resource
	InpatientService inpatientService;
	
	@RequestMapping("/queryHospitalizationadvice")
	@ResponseBody
	public List<Hospitalizationadvice> queryAllHospitalizationadvice(){
		
		HospitalizationadviceExample he = new HospitalizationadviceExample();
		
		return hospitalizationadviceService.queryAllHospitalizationadvice(he);
	}
	
	@RequestMapping("/queryPatientUser")
	@ResponseBody
	public List<Hospitalizationadvice> queryPatientUser(){
		
		return hospitalizationadviceService.queryPatientUser();
	}
	
	@RequestMapping("/updateHospitalizationadvice")
	@ResponseBody
	public Hospitalizationadvice sendUpdate(Integer hid) {
		
		Hospitalizationadvice hospitalizationadvice = hs.selectByPrimaryKey(hid);
		
		return hospitalizationadvice;
	}
	
	@RequestMapping("/saveHospitalizationadvice")
	@ResponseBody
	public Integer saveUpdateHospitalizationadvice(Hospitalizationadvice hospitalizationadvice) {
		
		return hospitalizationadviceService.updateHospitalizationadviceById(hospitalizationadvice);
	}
	
	@RequestMapping("/addHospitalizationadvice")
	@ResponseBody
	public Integer insertHospitalizationadvice(Hospitalizationadvice hospitalizationadvice) {
		
		//二次封装数据
		Integer hosId = inpatientService.getHospitalizationId(hospitalizationadvice.getPatient().getPatientid());
		
		if(hosId!=-1) {
			hospitalizationadvice.setHospitalizationid(hosId);
		}else {
			hospitalizationadvice.setHospitalizationid(0000);
		}
		
		return hospitalizationadviceService.insertHospitalizationadvice(hospitalizationadvice);
	}

}
