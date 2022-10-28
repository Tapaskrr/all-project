package com.te.hackerrank.mountblue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SalesByMatch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		int b[] = new int[] {1 ,1 ,3 ,1 ,2 ,1 ,3 ,3 ,3 ,3 };
		int j = 0;
		int count = 0;
		while (j < b.length) {
			list.add(b[j]);
			j++;
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int k = i+1; k < list.size(); k++) {
				System.out.println(i + " values of index " + k);
				if (list.get(i) == list.get(k)) {
					System.out.println("hi i m here"+i+"---"+k+"----"+list.get(i)+"----"+list.get(k));
					list.remove(i);
					list.remove(k-1);
					count++;
					i=-1;
					break;
				}
				System.out.println("not found"+"size is"+list.size());
			}
			System.out.println(i);
			System.out.println(list + "count" + count);
		}
		System.out.println(count);
	}
}
