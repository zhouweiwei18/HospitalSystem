package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Medicalrecord;
import com.web.entity.Prescription;
import com.web.service.PrescriptionService;

@Controller
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Resource
	PrescriptionService prescriptionService;
	
	@RequestMapping("/queryPrescription")
	@ResponseBody
	public List<Prescription> getAllPrescription(){
		
		List<Prescription> list = prescriptionService.getPrescription();

		return list;
	}

	
	
	@RequestMapping("/addPrescription")
	@ResponseBody
	
	public Integer addPrescription(Prescription Prescription) {
		
		Integer m= prescriptionService.addPrescription(Prescription);
		return m;
		
	}
	
	
	@RequestMapping("/getById")
	@ResponseBody
	public Prescription getById(Integer pid) {

		Prescription prescription = prescriptionService.getPrescriptionById(pid);
		return prescription;

	}
	
	@RequestMapping("/saveUpdatePrescription")
	@ResponseBody

	public Integer saveUpdatePrescription(Prescription prescriptionnumber) {

		return prescriptionService.updatePrescriptionByNumber(prescriptionnumber);
	}

	
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer prescriptionnumber) {

		Integer m = prescriptionService.deletePrescriptionById(prescriptionnumber);

		return m;

	}
	
	
	
	
}

















