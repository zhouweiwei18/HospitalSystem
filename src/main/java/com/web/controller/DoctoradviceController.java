package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Doctoradvice;
import com.web.service.DoctoradviceService;


@Controller
@RequestMapping("/doctoradvice")

public class DoctoradviceController {
	
	
	@Resource
	DoctoradviceService doctoradviceService;
	
	@RequestMapping("/queryDoctoradvice")
	@ResponseBody
	public List<Doctoradvice> getDoctoradvice() {
		
		List<Doctoradvice> list = doctoradviceService.getDoctoradvice();
		
		if (list == null) {
			return new ArrayList<Doctoradvice>();
		}
		
		return list;
	}
	
	

}
