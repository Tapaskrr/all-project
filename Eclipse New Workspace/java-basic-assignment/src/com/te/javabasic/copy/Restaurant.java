package com.te.javabasic.copy;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		
		//"hello"
			ItemDisplay.display();

			int[] foodOrder = ItemOrder.itemOrder();
			BillingDetais.display(foodOrder);
			
			
			System.out.println("press 1 for confirmation");
			System.out.println("press 2 for cancel");
			Scanner scanner=new Scanner(System.in);
			int finalOrder=scanner.nextInt();
			if(finalOrder==2)
				System.out.println("order cancelled");
			else
				System.out.println("order placed");
		
		
		


	}

}
