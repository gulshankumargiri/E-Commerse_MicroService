package com.orders.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.orders.requestDTO.InventoryDto;
import com.orders.response.ProductResponse;

@FeignClient(name = "INVENTORY-SERVICE")
public interface InventoryClient {

	@GetMapping("/inventory/{productId}")
	InventoryDto getInventory(@PathVariable Long productId);

	// reducing stocks
	@PutMapping("/reduce/{productId}/{quantity}")
	public InventoryDto reduceStock(@PathVariable Long productId, @PathVariable Integer quantity);

	@GetMapping("/products/{productId}")
	public ProductResponse getProduct(@PathVariable Long productId);

}
