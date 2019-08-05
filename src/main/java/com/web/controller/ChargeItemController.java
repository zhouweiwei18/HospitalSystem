package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Chargeitem;
import com.web.service.ChargeItemService;

@Controller
@RequestMapping("/chargeitem")
public class ChargeItemController {

	@Resource
	ChargeItemService cis;

	@RequestMapping("/getChargeitem")
	@ResponseBody
	public List<Chargeitem> getChargeitem() {

		List<Chargeitem> list = cis.queryAllInfo();

		return list;
	}

}
