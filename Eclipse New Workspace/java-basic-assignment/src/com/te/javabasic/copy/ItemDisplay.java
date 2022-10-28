package com.te.javabasic.copy;

public class ItemDisplay {
//hi hello

	public static void display() {

		ItemList itemList = new ItemList();

		
		for (int i = 0; i <itemList.foodList.length ; i++) {
			
			System.out.println(i+1+". "+itemList.foodList[i]+"----->"+itemList.price[i]);
			
		}
		
		}

	}


