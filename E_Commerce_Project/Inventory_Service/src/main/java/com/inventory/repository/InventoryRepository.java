package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.inventoryEntity;

public interface InventoryRepository extends JpaRepository<inventoryEntity, Long> {

	inventoryEntity findByProductId(Long id);
}
