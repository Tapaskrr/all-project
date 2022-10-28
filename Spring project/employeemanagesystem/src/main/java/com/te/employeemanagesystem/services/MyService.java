package com.te.employeemanagesystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.employeemanagesystem.entity.Employee;



public interface MyService {
public Boolean create(Employee employee);

public Employee authenticate(Employee employee);
public Boolean update(Employee employee,String empId);

public Boolean delete(Employee employee);

public List<Employee> allempdeatils();


}
