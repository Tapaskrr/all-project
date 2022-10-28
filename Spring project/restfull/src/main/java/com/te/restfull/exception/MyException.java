package com.te.restfull.exception;

public class MyException extends RuntimeException {
	private String msg; 
	public MyException(String msg) {
		this.msg=msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
