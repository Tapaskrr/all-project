package com.te.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
//		bean.setEmpId(30);
//		System.out.println(bean.getEmpId());
	}

}
