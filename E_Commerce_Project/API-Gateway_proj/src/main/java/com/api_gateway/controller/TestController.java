package com.api_gateway.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private final DiscoveryClient discoveryClient;

	public TestController(DiscoveryClient discoveryClient) {
		this.discoveryClient = discoveryClient;
	}

	@GetMapping("/instances")
	public Object instances() {
		return discoveryClient.getInstances("order_service");
	}
}
