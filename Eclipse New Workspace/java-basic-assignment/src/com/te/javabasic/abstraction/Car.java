package com.te.javabasic.abstraction;

public interface Car {

	public void gear();
	
	public void accelaration();
	
	default void gps() {
		
	}
	
}
