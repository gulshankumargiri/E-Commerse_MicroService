package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
