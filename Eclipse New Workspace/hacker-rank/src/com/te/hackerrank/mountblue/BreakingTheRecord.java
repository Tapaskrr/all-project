package com.te.hackerrank.mountblue;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecord {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] a = new int[] { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		int index=0;
		while(index<a.length) {
			list.add(a[index++]);
		}
		
		int max=list.get(0);
		int min=list.get(0);
		int maxCount=0;
		int minCount=0;
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i)>max) {
				max=list.get(i);
				maxCount++;
			}
			if (list.get(i)<min) {
				min=list.get(i);
				minCount++;
			}
			
		}
		System.out.println(maxCount+"---------"+minCount);
	}
	
}
