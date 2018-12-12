package com.florists.domain;

public abstract class Product {
	
	protected int id;
	protected double price;
	
	private static int COUNTER_FLORIST = 1;
	
	public Product(double price ) throws Exception {
		if(price <= 0) 
			throw new Exception();
			
			this.price = price;
			id = COUNTER_FLORIST;
			COUNTER_FLORIST++;			
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public static int getCOUNTER_FLORIST() {
		return COUNTER_FLORIST;
	}
	
	

}
