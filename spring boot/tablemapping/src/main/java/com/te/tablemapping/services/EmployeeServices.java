package com.te.tablemapping.services;

import com.te.tablemapping.entity.Employee;

public interface EmployeeServices {
	public Employee register(Employee employee);
	
	public Boolean setSecondaryEmployee(Employee employee);
	
	public Boolean setEducationalEmployee(Employee employee);
	
}
