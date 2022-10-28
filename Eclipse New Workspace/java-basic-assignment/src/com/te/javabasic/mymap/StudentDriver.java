package com.te.javabasic.mymap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentDriver {

	public static void main(String[] args) {
		StudentData studentData1 = new StudentData(1, "akash", 23, 56);
		StudentData studentData2 = new StudentData(2, "shyamlal", 24, 59);
		StudentData studentData3 = new StudentData(3, "sam", 26, 51);
		StudentData studentData4 = new StudentData(4, "ajay", 21, 50);

//		StudentData student[] = new StudentData[] { studentData1, studentData2, studentData3, studentData4 };
//
//		List list = new ArrayList();
//
//		for (int i = 0; i < student.length; i++) {
//			if (student[i].name.length() >= 4) {
//				list.add(student[i]);
//
//			}
//
//		}
//
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		List list=new ArrayList();
		list.add(studentData1);
		list.add(studentData2);
		list.add(studentData3);
		list.add(studentData4);
		
		Predicate<StudentData> predicate=( i)->{
			return i.name.length()>3;
		};
//
//		Comparable comparator=(o1)->{
//			return o1.name.length()>=4;
//		};
		
		List myList=(List) list.stream().filter(predicate).collect(Collectors.toList());
		myList.forEach(System.out::println);
		
		
		
	}

}
