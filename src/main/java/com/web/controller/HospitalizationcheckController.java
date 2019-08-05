package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Hospitalizationcheck;
import com.web.entity.HospitalizationcheckExample;
import com.web.service.HospitalizationadviceService;
import com.web.service.HospitalizationcheckService;
import com.web.service.InpatientService;

@Controller
public class HospitalizationcheckController {
	
	@Resource
	HospitalizationadviceService hospitalizationadviceService;
	
	@Resource
	InpatientService inpatientService;
	
	@Resource(name="hospitalizationcheckServiceImpl")
	HospitalizationcheckService hs;
	
	@Resource
	HospitalizationcheckService hospitalizationcheckService;
	
	@RequestMapping("/queryHospitalizationcheck")
	@ResponseBody
	public List<Hospitalizationcheck> queryAll(){
		
		HospitalizationcheckExample he = new HospitalizationcheckExample();
		
		return hospitalizationcheckService.queryAll(he);
	}
	
	@RequestMapping("/queryPatientUserCheck")
	@ResponseBody
	public List<Hospitalizationcheck> queryPatientUserCheck(){
		
		return hospitalizationcheckService.queryPatientUserCheck();
	}
	
	@RequestMapping("/updateHospitalizationcheck")
	@ResponseBody
	public Hospitalizationcheck sendUpdate(Integer hid) {
		
		Hospitalizationcheck hospitalizationcheck = hs.selectByPrimaryKey(hid);
		
		return hospitalizationcheck;
	}
	
	@RequestMapping("/saveHospitalizationcheck")
	@ResponseBody
	public Integer saveUpdateHospitalizationcheck(Hospitalizationcheck hospitalizationcheck) {
		
		return hospitalizationcheckService.updateHospitalizationcheckById(hospitalizationcheck);
	}
	
	@RequestMapping("/addHospitalizationcheck")
	@ResponseBody
	public Integer addHospitalizationcheck(Hospitalizationcheck hos) {
		
        Integer patientid = hos.getPatient().getPatientid();
		
		Integer hospitalizationId = inpatientService.getHospitalizationId(patientid);
		
		Integer adviceid = hospitalizationadviceService.getHospitalizationadviceId(hospitalizationId);
		
		hos.setHospitalizationadviceid(adviceid);
		
		return hospitalizationcheckService.insertHospitalizationcheck(hos);
	}

}
