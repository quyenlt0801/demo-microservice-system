package com.microservice.ordersservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.ordersservice.repository.OrderRepository;

public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
}
