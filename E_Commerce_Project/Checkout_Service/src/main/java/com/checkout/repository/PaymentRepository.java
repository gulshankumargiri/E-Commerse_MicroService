package com.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkout.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
