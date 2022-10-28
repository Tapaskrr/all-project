package com.te.springannotation.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component("emp")
public class Employee {
//	@Value("1")
	private int empId;
	@Autowired
//	@Qualifier("address1")
	// if 2 values for address it will send zero 
	private Address address2;
	public void display() {
		System.out.println("Employee class");
	}
}
