package com.checkout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkout.repository.InvoiceRepository;
import com.checkout.request.InvoiceRequest;
import com.checkout.response.InvoiceResponse;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	public InvoiceResponse generateInvoice(InvoiceRequest request) {

		return null;
	}
}
