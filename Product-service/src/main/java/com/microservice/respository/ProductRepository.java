package com.microservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
