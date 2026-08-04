package com.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orders.entity.OrderItemEntity;

public interface OrderItemRepo extends JpaRepository<OrderItemEntity, Long> {

}
