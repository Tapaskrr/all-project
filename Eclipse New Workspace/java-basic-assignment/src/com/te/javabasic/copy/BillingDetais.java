package com.te.javabasic.copy;




public class BillingDetais {

	public static void display(int[] foodOrder) {

		ItemList itemList = new ItemList();

		int totalPrice = 0;

		for (int i = 0; i < foodOrder.length; i++) {

			if (foodOrder[i] > 0) {
				System.out.println(itemList.foodList[i] + "----->" + itemList.price[i] * foodOrder[i]);
				totalPrice = totalPrice + itemList.price[i];
			}

		}

		System.out.println("TOTAL PRICE IS  : " + totalPrice);

	}

}
