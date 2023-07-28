package com.microservice.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private BigDecimal price;
}
