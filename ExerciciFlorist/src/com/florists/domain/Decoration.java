/**
 * 
 */
package com.florists.domain;

import com.florists.utilities.TypeMaterial;

/**
 * @author cristihan.valdiviezo
 *
 */
public class Decoration extends Product {
	
	private TypeMaterial material;

	public Decoration(TypeMaterial material, double price) throws Exception {
		super(price);
		this.material = material;		
	}

	
	public TypeMaterial getMaterial() {
		return material;
	}


	@Override
	public String toString() {
		return "Decoration [material=" + material + ", price=" + price +  "]";
	}
	

}
