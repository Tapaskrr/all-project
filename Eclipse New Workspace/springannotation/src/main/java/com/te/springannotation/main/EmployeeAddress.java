package com.te.springannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springannotation.config.EmployeeConfig;
import com.te.springannotation.pojo.Address;
import com.te.springannotation.pojo.Employee;

public class EmployeeAddress {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Address bean = context.getBean("address1", Address.class);
		bean.display();
		Employee bean2 = context.getBean("employee1", Employee.class);
		bean2.display();
		System.out.println("-----------");
		System.out.println(bean);
		System.out.println("-------------");
		System.out.println(bean2);
	}

}
