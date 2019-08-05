package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Operation;
import com.web.entity.OperationExample;
import com.web.service.HospitalizationadviceService;
import com.web.service.InpatientService;
import com.web.service.OperationService;

@Controller
public class OperationController {
	
	@Resource
	InpatientService inpatientService;
	
	@Resource
	HospitalizationadviceService hospitalizationadviceService;
	
	@Resource(name="operationServiceImpl")
	OperationService os;
	
	@Resource
	OperationService operationService;
	
	@RequestMapping("/queryOperation")
	@ResponseBody
	public List<Operation> queryAllOperation(){
		
		OperationExample oe = new OperationExample();
		
		return operationService.queryAllOperation(oe);
	}
	
	@RequestMapping("/queryPatientUserRoom")
	@ResponseBody
	public List<Operation> queryPatientUserRoom(){
		
		return operationService.queryPatientUserRoom();
	}
	
	@RequestMapping("/updateOperation")
	@ResponseBody
	public Operation sendUpdateOperation(Integer oid) {
		
		Operation operation = os.selectByPrimaryKey(oid);
		
		return operation;
	}
	
	@RequestMapping("/saveOperation")
	@ResponseBody
	public Integer saveUpdateOperation(Operation operation) {
		
		return operationService.updateOperationById(operation);
	}
	
	@RequestMapping("/addOperation")
	@ResponseBody
	public Integer addOperation(Operation operation) {
		
        Integer patientid = operation.getPatient().getPatientid();
		
		Integer hospitalizationId = inpatientService.getHospitalizationId(patientid);
		
		Integer adviceid = hospitalizationadviceService.getHospitalizationadviceId(hospitalizationId);
		
		operation.setHospitalizationadviceid(adviceid);
		
		return operationService.insertOperation(operation);
	}

}
