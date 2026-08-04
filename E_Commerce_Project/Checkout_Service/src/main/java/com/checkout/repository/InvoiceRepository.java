package com.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkout.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

}
