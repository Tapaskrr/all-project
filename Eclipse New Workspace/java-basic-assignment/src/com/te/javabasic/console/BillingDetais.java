package com.te.javabasic.console;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BillingDetais {
	
	public static void display(List foodOrder) {
		
//		Iterator iterator=foodOrder.iterator();
		
		ItemList itemList = new ItemList();
		
		int totalPrice=0;
		
		for (int i = 0; i < foodOrder.size() ; i++) {
		
			
			String foodName=((String) foodOrder.get(i)).toUpperCase();
//			System.out.println(b);
			String foodPrice=itemList.foodList.get(foodName);
			System.out.println(foodOrder.get(i)+"----->"+foodPrice);
			totalPrice=totalPrice+Integer.parseInt(foodPrice);
		}
		
		System.out.println("TOTAL PRICE IS  : "+totalPrice);
		
	}

}
