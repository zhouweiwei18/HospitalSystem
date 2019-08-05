package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Operationroom;
import com.web.entity.OperationroomExample;
import com.web.service.OperationroomService;

@Controller
public class OperationroomController {
	
	@Resource
	OperationroomService operationroomService;
	
	@RequestMapping("/queryOperationroom")
	@ResponseBody
	public List<Operationroom> queryAll(){
		
		OperationroomExample oe = new OperationroomExample();
		
		return operationroomService.queryAll(oe);
	}

}
