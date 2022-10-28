package com.te.javabasic.console;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

	
		ItemDisplay.display();
		
		List foodOrder=ItemOrder.itemOrder();
		BillingDetais.display(foodOrder);

		
	}

}
