package com.te.javabasic.copy;

import java.util.Scanner;

public class ItemOrder {
	static int[] itemOrder() {


		Scanner scanner = new Scanner(System.in);
		int food[]=new int[3];

		while (true) {

			System.out.println("press number for corresponding food");
			int foodInput = scanner.nextInt();
			
			
			try {
				if (foodInput<=3) {
					food[foodInput-1]++;
				}
				else {
					throw new FoodException("wrong input plz try again");
				}
			} catch (Exception e) {
					System.out.println(e.getMessage());
			}
			
			
			
				
				
			System.out.println("do you want to enter more food");

			System.out.println("press 1 for yes");
			
			System.out.println("press 2 for no");
			

			
			int stop = scanner.nextInt();

			if (stop==2) {
				break;
			}
		}

		return food;

	}
}
