package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Medicalrecord;
import com.web.service.MedicalrecordService;

@Controller
@RequestMapping("/medicalrecord")
public class MedicalrecordController {

	@Resource
	MedicalrecordService medicalrecordService;

	@RequestMapping("/queryMedicalrecord")
	@ResponseBody
	public List<Medicalrecord> getAllMedicalrecord() {

		List<Medicalrecord> list = medicalrecordService.getMedicalrecord();

		return list;
	}

	@RequestMapping("/addMedicalrecord")
	@ResponseBody

	public Integer addMedicalrecord(Medicalrecord medicalrecord) {

		Integer m = medicalrecordService.addMedicalrecord(medicalrecord);
		return m;

	}

	@RequestMapping("/getById")
	@ResponseBody
	public Medicalrecord getById(Integer mid) {

		Medicalrecord medicalrecord = medicalrecordService.getMedicalrecordById(mid);
		return medicalrecord;

	}

	@RequestMapping("/saveUpdateMedicalRecord")
	@ResponseBody

	public Integer saveUpdateMedicalRecord(Medicalrecord medicalrecordid) {

		return medicalrecordService.updateMedicalRecordById(medicalrecordid);
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer medicalrecordid) {

		Integer m = medicalrecordService.deleteMedicalRecordById(medicalrecordid);

		return m;

	}

}
