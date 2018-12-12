package com.florists.domain;

public abstract class Product {

	protected int id;
	protected double price;

	private static int COUNTER_PRODUCT = 1;

	public Product(double price) throws Exception {
		if (price <= 0)
			throw new Exception();
		this.price = price;
		id = COUNTER_PRODUCT;
		COUNTER_PRODUCT++;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

}
