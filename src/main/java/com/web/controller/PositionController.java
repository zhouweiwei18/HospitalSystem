package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Position;
import com.web.entity.PositionExample;
import com.web.service.PositionService;

@Controller
@RequestMapping("/position")
public class PositionController {

	@Resource
	PositionService positionService;

	@RequestMapping("/queryPosition")
	@ResponseBody
	public List<Position> queryPosition() {

		PositionExample pe = new PositionExample();

		return positionService.queryAllPosition(pe);
	}

}
