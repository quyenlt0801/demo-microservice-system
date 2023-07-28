package com.microservice.inventorymicroservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.inventorymicroservice.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long>{
    Optional<Inventory>  findAllBySkuCode(String skuCode);
}
