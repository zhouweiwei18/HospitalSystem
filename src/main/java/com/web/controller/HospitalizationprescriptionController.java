package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Hospitalizationprescription;
import com.web.entity.HospitalizationprescriptionExample;
import com.web.service.HospitalizationadviceService;
import com.web.service.HospitalizationprescriptionService;
import com.web.service.InpatientService;

@Controller
public class HospitalizationprescriptionController {
	
	@Resource
	HospitalizationadviceService hospitalizationadviceService;
	
	@Resource(name="hospitalizationprescriptionServiceImpl")
	HospitalizationprescriptionService hs;
	
	@Resource
	HospitalizationprescriptionService hospitalizationprescriptionService;
	
	@Resource
	InpatientService inpatientService;
	
	@RequestMapping("queryHospitalizationprescription")
	@ResponseBody
	public List<Hospitalizationprescription> queryAll(){
		
		HospitalizationprescriptionExample he = new HospitalizationprescriptionExample();
		
		return hospitalizationprescriptionService.queryall(he);
	}
	
	@RequestMapping("/querypatientdrugs")
	@ResponseBody
	public List<Hospitalizationprescription> querypatientgrugs(){
		
		return hospitalizationprescriptionService.querypatientdrugs();
	}
	
	@RequestMapping("/updateHospitalizationprescription")
	@ResponseBody
	public Hospitalizationprescription sendUpdate(Integer pid) {
		
		Hospitalizationprescription hospitalizationprescription = hs.selectByPrimaryKey(pid);
		
		return hospitalizationprescription;
	}
	
	@RequestMapping("/saveHospitalizationprescription")
	@ResponseBody
	public Integer saveUpdateHospitalizationprescription(Hospitalizationprescription hospitalizationprescription) {
		
		return hospitalizationprescriptionService.updateHospitalizationprescriptionById(hospitalizationprescription);
	}
	
	@RequestMapping("/addHospitalizationprescription")
	@ResponseBody
	public Integer insertHospitalizationprescription(Hospitalizationprescription hos) {
		
		Integer patientid = hos.getPatient().getPatientid();
		
		Integer hospitalizationId = inpatientService.getHospitalizationId(patientid);
		
		Integer adviceid = hospitalizationadviceService.getHospitalizationadviceId(hospitalizationId);
		
		hos.setResidentadviceid(adviceid);
		
		return hospitalizationprescriptionService.insertHospitalizationprescription(hos);
	}
}
