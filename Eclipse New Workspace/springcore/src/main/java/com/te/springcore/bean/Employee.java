package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Employee implements Serializable {

	private Integer empId;
	private Address address;
//	public Employee(Integer empId, Address address) {
//		super();
//		System.out.println("hello");
//		this.empId = empId;
//		this.address = address;
//	}

	
	
}
