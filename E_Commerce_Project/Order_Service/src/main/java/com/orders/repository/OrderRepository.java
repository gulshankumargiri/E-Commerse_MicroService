package com.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orders.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
