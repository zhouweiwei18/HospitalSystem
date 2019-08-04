package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Icu;
import com.web.service.IcuService;

@Controller
@RequestMapping("/icu")
public class IcuController {

	@Resource
	IcuService icuService;

	@RequestMapping("/addIcu")
	@ResponseBody
	public Integer addIcu(Icu icu) {

		// 二次封装数据
		icu.setIsdelete(0);
		icu.setUnhealedrate(Double.parseDouble("100"));
		icu.setMortality(Double.parseDouble("100"));
		icu.setDiagnosticcoincidence("符合");
		icu.setBedutilizationrate(Double.parseDouble("100"));

		return icuService.addIcu(icu);
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Icu icu) {
		icu.setIsdelete(1);
		return icuService.deleteById(icu);
	}

	@RequestMapping("/updateIcuById")
	@ResponseBody
	public Integer updateIcuById(Icu icu) {

		return icuService.updateIcu(icu);
	}

	@RequestMapping("/queryIcu")
	@ResponseBody
	public List<Icu> queryIcu() {

		return icuService.getAllIcu();
	}

	@RequestMapping("/getIcuById")
	@ResponseBody
	public Icu getIcuById(Integer icuid) {

		return icuService.getIcuById(icuid);
	}

}
