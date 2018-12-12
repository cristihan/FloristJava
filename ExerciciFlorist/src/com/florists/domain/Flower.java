package com.florists.domain;

import com.florists.utilities.Colour;

public class Flower extends Product {
	
	private Colour colour;

	public Flower(Colour colour, double price) throws Exception {
		super(price);
		this.colour = colour;
		
	}

	
	public Colour getColour() {
		return colour;
	}

	
	@Override
	public String toString() {
		return "Flower [colour=" + colour + ", price=" + price +  "]";
	}
	
	

}
