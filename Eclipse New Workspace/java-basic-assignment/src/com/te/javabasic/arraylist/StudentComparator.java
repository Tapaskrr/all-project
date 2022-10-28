package com.te.javabasic.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparator {
	public static void main(String[] args) {
		MyComparator name1 = new MyComparator(1, "1stname", "bangalore");
		MyComparator name2 = new MyComparator(2, "3rdname", "mysore");
		MyComparator name3 = new MyComparator(3, "2ndname", "australia");
		MyComparator name4 = new MyComparator(3, "2ndname", "zustralia");

		ArrayList list = new ArrayList();
		list.add(name2);
		list.add(name1);
		list.add(name3);
		list.add(name4);
		System.out.println("using comparable-------");
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("using comparator-------");
		Collections.sort(list, new MyCompare());
		for (Object object : list) {
			System.out.println(object);
		}

	}
}
