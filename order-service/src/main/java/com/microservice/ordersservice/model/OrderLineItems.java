package com.microservice.ordersservice.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "OrderlineItems")
@Table(name = "OrderlineItems")
@Data
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @Column(name = "skuCode")
    private String skuCode;
     @Column(name = "price")
    private BigDecimal price;
     @Column(name = "quantity")
    private Integer quantity;
}
