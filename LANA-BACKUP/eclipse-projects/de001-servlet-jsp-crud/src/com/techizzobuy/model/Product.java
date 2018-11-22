package com.techizzobuy.model;

public class Product {

	public Product(String productId, String name, String description, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	private String productId;
	private String name;
	private String description;
	private float price;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
