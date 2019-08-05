package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.OrderMapper;
import com.web.entity.Order;
import com.web.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderMapper   orderMapper;

	@Override
	public List<Order> getAllorder() {
	
		return orderMapper.getAll();
	}

}
