package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Bed;
import com.web.entity.BedExample;
import com.web.service.BedSerevice;

@Controller
@RequestMapping("/bed")
public class BedController {
	
	@Resource(name="bedServiceImpl")
	BedSerevice bs;
	
	@Resource
	BedSerevice bedService;
	
	@RequestMapping("/queryBed")
	@ResponseBody
	public List<Bed> queryAllBed(){
		
		BedExample be = new BedExample();
		
		return bedService.queryAllBed(be);
	}
	
	@RequestMapping("/queryBedUserIcu")
	@ResponseBody
	public List<Bed> queryBedUser(){
		
		return bedService.queryBedUserIcu();
	}
	
	@RequestMapping("updateBed")
	@ResponseBody
	public Bed sendUpdate(Integer bid) {
		
		Bed bed = bs.selectByPrimaryKey(bid);
		
		return bed;
	}
	
	@RequestMapping("/saveBed")
	@ResponseBody
	public Integer saveUpdateBed(Bed bed) {
		
		return bedService.updateBedById(bed);
	}
	
	@RequestMapping("/addBed")
	@ResponseBody
	public Integer addBed(Bed bed) {
		
		return bedService.insertBed(bed);
	}

}
