package com.te.javabasic.abstraction;

public class Audi implements Car {

	@Override
	public void gear() {
		System.out.println("audi car");
	}

	@Override
	public void accelaration() {
		System.out.println("");
	}

}
