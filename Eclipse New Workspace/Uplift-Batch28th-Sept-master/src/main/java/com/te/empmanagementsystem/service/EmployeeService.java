package com.te.empmanagementsystem.service;

import com.te.empmanagementsystem.entity.Employee;

public interface EmployeeService {

	public boolean register(Employee employee);

	public Employee authenticate(Employee employee);
}
