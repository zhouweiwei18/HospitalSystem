package com.web.controller;

import java.util.ArrayList;
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

	@RequestMapping("/queryChargeitem")
	@ResponseBody
	public List<Chargeitem> getAllChargeitem() {

		List<Chargeitem> list = cis.getChargeitem();

		if (list == null) {
			return new ArrayList<Chargeitem>();
		}
		return list;
	}

	@RequestMapping("/addChargeitem")
	@ResponseBody

	public Integer addChargeitem(Chargeitem chargeitem) {

		Integer r = cis.addChargeitem(chargeitem);
		return r;
	}

	@RequestMapping("/getById")
	@ResponseBody
	public Chargeitem getById(Integer chargeid) {

		Chargeitem chargeitem = cis.getChargeitemById(chargeid);
		return chargeitem;

	}

	@RequestMapping("/saveUpdateChargeitem")
	@ResponseBody

	public Integer saveUpdateChargeitem(Chargeitem chargeid) {

		return cis.updateChargeitemById(chargeid);
	}

}
