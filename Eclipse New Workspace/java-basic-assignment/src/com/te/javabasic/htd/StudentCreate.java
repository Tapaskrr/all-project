package com.te.javabasic.htd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentCreate {

	public static void main(String[] args) {
		TreeSet students=new TreeSet();
		
		Student student1=new Student(1, 24, 70, "akhil");
		
		students.add(student1);
		
		Student student2=new Student(2, 23, 50, "bijay");

		students.add(student2);

		students.add(new Student(3, 22, 45, "ajay"));

		students.add(new Student(4, 24, 49, "raj"));
		
		
		while (true) {
			System.out.println("press corresponding number for serial order");
			System.out.println("1 for---->id");
			System.out.println("2 for---->age");
			System.out.println("3 for---->marks");
			System.out.println("4 for---->name");
			Scanner scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();
			
			Student.temp = userInput;
			System.out.println(students);
			switch (userInput) {
			case 1:

				
				Iterator iterator = students.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());

				}
				break;
			case 2:
				Iterator iterator1 = students.iterator();
				while (iterator1.hasNext()) {
					System.out.println(iterator1.next());

				}
				break;
			case 3:
				Iterator iterator2 = students.iterator();
				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());

				}
				break;
			case 4:
				Iterator iterator3 = students.iterator();
				while (iterator3.hasNext()) {
					System.out.println(iterator3.next());

				}
				break;
			default:
				System.out.println("wrong inpur--plz select again");
				break;
			}

			if (userInput < 1 || userInput > 4) {
				continue;
			}

			System.out.println("press 1 for yes if want to continue");
			System.out.println("press 2 for no if want to continue");
			int wantContinue = scanner.nextInt();
			if (wantContinue == 2) {
				break;
			} else if (wantContinue == 1) {
				continue;
			} else {
				System.out.println("press 1 for yes if want to continue");
				System.out.println("press 2 for no if want to continue");
				int wantContinue3 = scanner.nextInt();
				if (wantContinue3 == 2) {
					break;
				} else if (wantContinue == 1) {
					continue;
				} else {
					System.out.println("sorry multiple attempt done, try again later");
					break;
				}
			}
		}

	}
}

