package com.te.restfull.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.restfull.exception.MyException;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(MyException.class)
	public String excepHandler(HttpServletRequest request,MyException myException) {
		request.setAttribute("errmsg", myException.getMessage());
		return "login";
}
}
