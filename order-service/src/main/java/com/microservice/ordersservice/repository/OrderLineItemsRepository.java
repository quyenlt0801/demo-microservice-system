package com.microservice.ordersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.ordersservice.model.OrderLineItems;
@Repository
public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems,Long>{
    
}
