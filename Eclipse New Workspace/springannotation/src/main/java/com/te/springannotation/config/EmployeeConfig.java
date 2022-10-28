package com.te.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springannotation.pojo.Address;
import com.te.springannotation.pojo.Employee;

@Configuration
@ComponentScan(basePackages = "com.te.springannotation")
public class EmployeeConfig {

	@Bean
	public Employee employee1() {
		Employee employee = new Employee();
		employee.setEmpId(50);
		return employee;
	}

	@Bean
	public Employee employee2() {
		Employee employee = new Employee();
		employee.setEmpId(100);
		return employee;
	}

	@Bean
//	@Primary
	public Address address1() {
		Address address = new Address();
		address.setAddressId(2);
		return address;
	}

	@Bean
	public Address address2() {
		Address address = new Address();
		address.setAddressId(5444);
		return address;
	}

}
