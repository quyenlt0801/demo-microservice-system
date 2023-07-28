package com.microservice.inventorymicroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.microservice.inventorymicroservice.model.Inventory;
import com.microservice.inventorymicroservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMicroserviceApplication.class, args);

	}
	// @Bean
	// public CommandLineRunner loadData(InventoryRepository inventsitory){
	// 	return args ->{
	// 		Inventory i1 = new Inventory();
	// 	i1.setSkuCode("iphone-13");
	// 	i1.setStock(10);

	// 	Inventory i2 = new Inventory();
	// 	i2.setSkuCode("iphone-13promax");
	// 	i2.setStock(1);
	// 	inventsitory.save(i1);
	// 	inventsitory.save(i2);
	// 	};
	// }

}
