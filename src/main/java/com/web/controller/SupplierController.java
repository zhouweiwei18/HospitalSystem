package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Supplier;
import com.web.service.SupplierService;

@RequestMapping("/supplier")
@Controller
public class SupplierController {
	
	
	@Autowired
	SupplierService  supplierService;
	
	
	
	@RequestMapping("/getAllsupplier")
	@ResponseBody
	public  List<Supplier>  getAllsupplier(){
		
		
		return supplierService.getAllsupplier();
	
	}
	
	//根据id 查询供应商信息
	@RequestMapping("/selectSupplierByid")
	@ResponseBody
	public Supplier selectSupplierByid(Integer supplierid){
		
		return  supplierService.selectSupplierByid(supplierid);
	}
    
	
	//修改供应商信息
	@RequestMapping("/updatesupplier")
	@ResponseBody
	public int updatesupplier(Supplier supplier) {

		
		 return  supplierService.updatesupplier(supplier);
	}
	
	//删除
	@RequestMapping("/delSupplierByid")
	@ResponseBody
	public int delSupplierByid(Integer supplierid){
		
		
		return supplierService.delSupplierByid(supplierid);
		
	}
	
	
	@RequestMapping("/addsupplier")
	@ResponseBody
	public int addsupplier(Supplier supplier){
		
		
		return supplierService.addsupplier(supplier);
		
	}
	
	
	
	
	
	
	
	
	
}
