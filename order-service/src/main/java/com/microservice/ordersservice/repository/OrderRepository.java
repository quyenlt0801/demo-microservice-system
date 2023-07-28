package com.microservice.ordersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.ordersservice.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
