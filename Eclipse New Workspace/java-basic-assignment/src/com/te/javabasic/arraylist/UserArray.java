package com.te.javabasic.arraylist;

import java.util.Iterator;

public class UserArray {

	public static void main(String[] args) {

		MyArrayList arrayList = new MyArrayList(5);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
//		arrayList.add(230);
		System.out.println(arrayList);
		System.out.println("-----------");
		for (Object object : arrayList) {
			System.out.println(object);
		}
		System.out.println("-----------");
		Iterator iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
		}
		
	}



}
