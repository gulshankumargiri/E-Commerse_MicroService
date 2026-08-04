package com.orders.requestDTO;

public class OrderRequest {

	private Long productId;
	private Long inventoryProductId;
	private Integer quantity;

	private String customerName;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getInventoryProductId() {
		return inventoryProductId;
	}

	public void setInventoryProductId(Long inventoryProductId) {
		this.inventoryProductId = inventoryProductId;
	}

	//

}