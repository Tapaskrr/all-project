package com.te.javabasic.abstraction;

public class Bmw implements Car {

	@Override
	public String brake() {
		return "bmw brake";
	}

	@Override
	public String accelaration() {
		return "bmw accelaration";
	}

	@Override
	public String gear() {
		return "bmw gear";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hhhhello");
	}

}
