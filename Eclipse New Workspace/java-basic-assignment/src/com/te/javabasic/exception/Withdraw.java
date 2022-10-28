package com.te.javabasic.exception;

public class Withdraw {
	public static void withdraw(double balance) {
		if (balance<=5000) {
			throw new BankException("not possible");
		}
	}

}
