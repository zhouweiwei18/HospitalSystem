package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Order;
import com.web.service.OrderService;

@RequestMapping("/order")
@Controller
public class OrderController {
	
	
	@Autowired
	OrderService  orderService;
	
	@RequestMapping("/getAllorder")
	@ResponseBody
	public List<Order>   getAllorder(){				
		
		return  orderService.getAllorder();
		
	}

}
