/**
 * 
 */
package com.florists.domain;

/**
 * @author cristihan.valdiviezo
 *
 */
public class Tree extends Product {
	
	protected double heigth;

	public Tree(double heigth, double price) throws Exception {
		super(price);
		this.heigth =heigth;
	}

	
	@Override
	public String toString() {
		return "heigth=" + heigth + ", price=" + price;
		
	}
	
	
	public double getHeigth() {
		return heigth;
	}



}
