package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Patient;
import com.web.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Resource
	PatientService patientService;

	@RequestMapping("/getPatient")
	@ResponseBody
	public List<Patient> getPatient() {

		List<Patient> list = patientService.getSalaryInfo();

		return list;
	}

	@RequestMapping("/queryPatient")
	@ResponseBody
	public List<Patient> getPatienter() {

		List<Patient> list = patientService.getSalaryInfo();

		return list;
	}

	// 涂元卉----------------------------------
 
	@RequestMapping("/getinfoByid")
	@ResponseBody
	public Patient getinfoByid(Integer patientid) {

		return patientService.getinfoByid(patientid);
	}

	@RequestMapping("/updateinfo")
	@ResponseBody
	public int updateinfo(Patient patient) {

		return patientService.updateinfo(patient);

	}

	@RequestMapping("/delinfo")
	@ResponseBody
	public int delinfo(Integer patientid) {

		return patientService.delinfo(patientid);

	}

	@RequestMapping("/addinfo")
	@ResponseBody
	public int addinfo(Patient patient) {

		return patientService.addinfo(patient);

	}

}
