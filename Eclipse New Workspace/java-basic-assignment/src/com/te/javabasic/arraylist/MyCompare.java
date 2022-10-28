package com.te.javabasic.arraylist;

import java.util.Comparator;

public class MyCompare implements Comparator<MyComparator> {

	@Override
	public int compare(MyComparator o1, MyComparator o2) {
		return o1.getter() - o2.getter();
	}

}
