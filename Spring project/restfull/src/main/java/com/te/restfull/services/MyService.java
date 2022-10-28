package com.te.restfull.services;

import java.util.List;

import com.te.restfull.entity.Employee;

public interface MyService {
	public Boolean create(Employee employee);

	public Employee authenticate(Employee employee);
	public Boolean update(Employee employee,String empId);

	public Boolean delete(String empId);

	public List<Employee> allempdeatils();

}
