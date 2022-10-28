package com.te.javabasic.console;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ItemOrder {
	static List itemOrder() {

//		Map<String, String> food = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);

		List<String> food=new ArrayList<String>();
		while (true) {

			System.out.println("enter food name");
			String foodInput = scanner.next();

			
			
			ItemList itemList = new ItemList();
			if (itemList.foodList.containsKey(foodInput)) {
				food.add(foodInput);
			}
			
			food.add(foodInput);

			System.out.println("do you want to enter more food");

			System.out.println("----------press yes or no---------");
			
//			scanner.nextline();
			
			String stop = scanner.next();

			if (stop.equalsIgnoreCase("no")) {
				break;
			}
		}

		return food;

	}
}
