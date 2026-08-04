package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.requests.InventoryRequest;
import com.inventory.response.InventoryResponse;
import com.inventory.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	InventoryService service;

	// creating new record of inventory of product
	@PostMapping("/create")
	public InventoryResponse createData(@RequestBody InventoryRequest request) {

		return service.create(request);

	}

	// finding by product id - inventory details
	@GetMapping("/{productId}")
	public InventoryResponse getInventoryById(@PathVariable Long productId) {

		InventoryResponse res = service.getInventory(productId);

		return res;
	}

	// reducing stocks

	@PutMapping("/reduce/{productId}/{quantity}")
	public InventoryResponse reduceStock(@PathVariable Long productId, @PathVariable Integer quantity) {

		return service.reduceStockInInventory(productId, quantity);
	}

}
