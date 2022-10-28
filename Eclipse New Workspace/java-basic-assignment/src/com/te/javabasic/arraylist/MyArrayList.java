package com.te.javabasic.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MyArrayList implements Iterable {

	int position;
	int tempHasNext = -1;
	int tempNext;
	private Object[] arg;

	MyArrayList(int size) {
		arg = new Object[size];

	}

	public void add(Object value) {

		try {
			arg[position] = value;
			position++;
		} catch (Exception exception) {
			grow(value);
		}

	}

	private void grow(Object value) {
		Object[] argNew = new Object[arg.length + 1];
		for (int i = 0; i < arg.length; i++) {
			argNew[i] = arg[i];
		}
//		System.arraycopy(arg, 0, argNew, 0, arg.length);
		argNew[position] = value;
		position++;
		arg = argNew;

	}

	public Object get(int element) {
		return arg[element];
	}

	public int size() {
		return this.position;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp = "";
		temp = temp + "[";
		for (int i = 0; i < size(); i++) {

			if (size() == 1) {
				temp = temp + arg[i];
			} else if (i == size() - 1) {
				temp = temp + arg[i];
			} else {
				temp = temp + arg[i] + ",";
			}

		}
		temp = temp + "]";
		return temp;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyItr();
	}

	private class MyItr implements Iterator {

		int index;

		@Override
		public boolean hasNext() {

			return (index < position) ? true : false;

		}

		@Override
		public Object next() {
			return arg[index++];
		}

	}

}
