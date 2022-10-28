package com.te.javabasic.exception;

public class BankUser {
	public static void main(String[] args) {
		try {
			Withdraw.withdraw(6000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
