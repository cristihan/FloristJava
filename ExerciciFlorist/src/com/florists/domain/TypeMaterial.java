package com.florists.domain;

public enum TypeMaterial {
	
	WOOD("wood"),
	PLASTIC("plastic");
	
	private String name;
	

	private TypeMaterial(String name) {
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {		
		return name;
	}
	
	




}
