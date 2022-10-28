package com.testyantra.javabasic;
//
// four method with different access specifier
//
public class AccessSpecifierDemo {

	protected static void protectedMethod() {
		System.out.println("it is static protected method");
	}
	
	protected void nonStaticProtectedMethod() {
		System.out.println("it is non static protected method");
	}
	
	private static void privateMethod(){
		System.out.println("it is static private method");
	}
	
	private void nonStaticPrivateMethod() {
		System.out.println("it is non static private method");
	}
	
	 static void defaultMethod() {
		System.out.println("it is static default method");
	}
	
	 void nonStatiDeafaultMethod() {
		System.out.println("it is non static default method");
	}
	
	public static void publicMethod() {
		System.out.println("it is static public method");
	}
	
	public void nonStaticPublicMethod() {
		System.out.println("it is non static public method");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
