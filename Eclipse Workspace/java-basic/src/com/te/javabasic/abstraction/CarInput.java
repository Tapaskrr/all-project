package com.te.javabasic.abstraction;

import java.util.Scanner;

public class CarInput {

	static Car carinput() {
		
		Scanner scanner = new Scanner(System.in);

//		String carName = scanner.next();


		String i = scanner.next();
		
		if(i.equalsIgnoreCase("audi"))
			return new Audi();
		else
			return new Bmw();

	}



}
