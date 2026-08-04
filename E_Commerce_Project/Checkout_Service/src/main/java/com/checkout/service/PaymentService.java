package com.checkout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkout.repository.PaymentRepository;
import com.checkout.request.PaymentRequest;
import com.checkout.response.PaymentResponse;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository repository;

	public PaymentResponse doPayment(PaymentRequest request) {

		return null;
	}
}
