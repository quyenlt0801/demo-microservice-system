package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.Product;
import com.microservice.respository.ProductRepository;
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.save(product);
    }
    public List<Product> listAll(){
       return productRepository.findAll();
    }
    
}
