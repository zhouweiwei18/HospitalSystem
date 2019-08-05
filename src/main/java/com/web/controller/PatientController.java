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

}
