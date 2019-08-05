package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Chargestatus;
import com.web.service.ChargeStatusService;

@Controller
@RequestMapping("/chargestatus")
public class ChargeStatusController {

	@Resource
	ChargeStatusService css;

	@RequestMapping("/addChargestatus")
	@ResponseBody
	public Integer addChargestatus(Chargestatus chargestatus) {
 
		return css.addChargestatus(chargestatus);
	}
	
	@RequestMapping("/updateChargestatusById")
	@ResponseBody
	public Integer updateChargestatusById(Chargestatus chargestatus) {
		
		return css.updateChargeStatusById(chargestatus);
	}
	
	
	@RequestMapping("/getChargestatusById")
	@ResponseBody
	public Chargestatus getChargestatusById(Integer chargestatusid) {
		
		Chargestatus cs = css.getChargeStatusById(chargestatusid);
		
		return cs;
	}

	@RequestMapping("/queryAllChargeStatus")
	@ResponseBody
	public List<Chargestatus> queryAllChargeStatus() {

		List<Chargestatus> list = css.queryAllChargeStatus();

		return list;
	}

}
