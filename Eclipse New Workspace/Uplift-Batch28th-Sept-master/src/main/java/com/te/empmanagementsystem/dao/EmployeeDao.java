package com.te.empmanagementsystem.dao;

import com.te.empmanagementsystem.entity.Employee;

public interface EmployeeDao {
	
	public boolean register(Employee employee);
	
	public Employee authenticate(Employee employee);

}
