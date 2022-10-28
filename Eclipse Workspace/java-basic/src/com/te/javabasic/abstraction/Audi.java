package com.te.javabasic.abstraction;

public class Audi implements Car {

	@Override
	public String brake() {
		return "audi brake";
	}

	@Override
	public String accelaration() {
		return "audi accelaration";
	}

	@Override
	public String gear() {
		return "audi gear";
	}
	
	public void gps() {
		System.out.println("audi gps");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hellohi");
	}

	
}
