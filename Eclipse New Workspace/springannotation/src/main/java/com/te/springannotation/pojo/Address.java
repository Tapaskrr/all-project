package com.te.springannotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Address {

//	@Value("10")
	private int addressId;

	public void display() {
		System.out.println("Address class");
	}
}
