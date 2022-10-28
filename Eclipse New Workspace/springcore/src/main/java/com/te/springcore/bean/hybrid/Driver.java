package com.te.springcore.bean.hybrid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("hybrid.xml");
		Car bean = context.getBean("car",Car.class);
		System.out.println(bean);
	}

}
