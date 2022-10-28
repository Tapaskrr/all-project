package com.te.javabasic.functional;

import java.util.ArrayList;
import java.util.List;

public class MyThread{


	public static void main(String[] args) {
		
		Runnable runnable1 = () -> {
			int i=0;
			while (i<10) {
				System.out.println(i+"---"+Thread.currentThread().getName());
				i++;
			}
		};
		
		Runnable runnable2 = () -> {
			char ch='a';
			while (ch<'h') {
				System.out.println(ch++ +"---"+Thread.currentThread().getName());
			}
		};

		Thread myThread1 = new Thread(runnable1);
		Thread myThread2 = new Thread(runnable2);
		myThread1.start();
		myThread2.start();
		
		

	}
}