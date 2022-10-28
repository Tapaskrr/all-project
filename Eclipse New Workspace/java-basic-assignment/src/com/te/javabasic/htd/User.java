package com.te.javabasic.htd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class User {

	public static void main(String[] args) {

		Set<Student> students = new HashSet<Student>();

		students.add(new Student(1, 24, 70, "akhil"));

		students.add(new Student(2, 23, 50, "bijay"));

		students.add(new Student(3, 22, 45, "ajay"));

		students.add(new Student(4, 24, 49, "raj"));

		students.add(new Student(4, 23, 55, "goutam"));

		
//		System.out.println(students);
		while (true) {
			System.out.println("press corresponding number for serial order");
			System.out.println("1 for---->id");
			System.out.println("2 for---->age");
			System.out.println("3 for---->marks");
			System.out.println("4 for---->name");
			System.out.println("5 for---->id");
			System.out.println("6 for---->age");
			Scanner scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();

			Student.temp = userInput;
			ArrayList student = new ArrayList(students);

			Comparator<Student> comparator = (student1, student2) -> {
				return student1.studentAge - student2.studentAge;
			};

			switch (userInput) {
			case 1:

				Collections.sort(student);
				Iterator iterator = student.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());

				}
				break;
			case 2:
				Collections.sort(student);
				Iterator iterator1 = student.iterator();
				while (iterator1.hasNext()) {
					System.out.println(iterator1.next());

				}
				break;
			case 3:
				Collections.sort(student, new StudentCompareTo(3));
				Iterator iterator2 = student.iterator();
				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());

				}
				break;
			case 4:
				Collections.sort(student, new StudentCompareTo(4));
				Iterator iterator3 = student.iterator();
				while (iterator3.hasNext()) {
					System.out.println(iterator3.next());

				}
				break;
			case 5:
				List list = (List) student.stream().sorted().collect(Collectors.toList());
				list.forEach(System.out::println);
				break;
			case 6:
				((List) student.stream().sorted(comparator).collect(Collectors.toList())).forEach(System.out::println);
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
