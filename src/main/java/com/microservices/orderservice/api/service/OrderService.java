package com.microservices.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.orderservice.api.entity.Order;
import com.microservices.orderservice.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;	
	

	public Order saveOrder(Order order) {
		
		return repository.save(order);
		
	}

}
