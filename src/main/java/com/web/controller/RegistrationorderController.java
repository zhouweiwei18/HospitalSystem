package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Registrationorder;
import com.web.service.RegistrationorderService;

@Controller
@RequestMapping("/registrationorder")

public class RegistrationorderController {

	@Resource
	RegistrationorderService registrationorderService;

	@RequestMapping("/queryRegistrationorder")
	@ResponseBody
	public List<Registrationorder> getRegistrationorder() {

		List<Registrationorder> list = registrationorderService.getRegistrationorder();

		return list;
	}

	@RequestMapping("/addRegistrationorder")
	@ResponseBody

	public Integer addRegistrationorder(Registrationorder registrationorder) {

		Integer r = registrationorderService.addRegistrationorder(registrationorder);
		return r;
	}

	@RequestMapping("getById")
	@ResponseBody
	public Registrationorder getById(Integer rid) {

		Registrationorder registrationorder = registrationorderService.getRegistrationorderById(rid);

		return registrationorder;
	}

	@RequestMapping("saveUpdateRegistrationorder")
	@ResponseBody
	public Integer saveUpdateRegistrationorder(Registrationorder registerid) {

		return registrationorderService.updateRegistrationorderById(registerid);
	}

	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer registerid) {

		Integer m = registrationorderService.deleteRegistrationorderById(registerid);

		return m;

	}
	
}
