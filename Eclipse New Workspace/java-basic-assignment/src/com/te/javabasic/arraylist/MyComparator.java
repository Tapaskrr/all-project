package com.te.javabasic.arraylist;

import java.util.Comparator;

public class MyComparator implements Comparable<MyComparator> {

	private int id;
	private String name;
	private String city;

	public MyComparator(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getter() {
		return this.id;
	}

	@Override
	public int compareTo(MyComparator student) {
		// TODO Auto-generated method stub
//		System.out.println("student-- "+student.city);
//		System.out.println("this-- "+this.city);
		return student.city.compareTo(this.city);
	}

	@Override
	public String toString() {
		return "MyComparator [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
