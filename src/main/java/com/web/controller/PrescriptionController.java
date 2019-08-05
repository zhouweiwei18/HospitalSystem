package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Prescription;
import com.web.service.PrescriptionService;

@Controller
@RequestMapping("/prescription")
public class PrescriptionController {

	@Resource
	PrescriptionService prescriptionService;

	@RequestMapping("/queryPrescription")
	@ResponseBody
	public List<Prescription> getAllPrescription() {
		List<Prescription> list = prescriptionService.getPrescription();

		if (list == null) {

			return new ArrayList<Prescription>();
		}
		return list;
	}

	@RequestMapping("/addPrescription")
	@ResponseBody

	public Integer addPrescription(Prescription Prescription) {

		Integer m = prescriptionService.addPrescription(Prescription);

		return m;

	}

}
