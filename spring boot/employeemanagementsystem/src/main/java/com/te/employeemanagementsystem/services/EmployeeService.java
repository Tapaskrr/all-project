package com.te.employeemanagementsystem.services;

import java.util.List;

import com.te.employeemanagementsystem.entity.Employee;

public interface EmployeeService {
	public Employee getEmployee(String empId);
	
	public List<Employee> getAll();
	
	public Employee register(Employee employee);
	
	public Boolean deletedata(String empId);
}
