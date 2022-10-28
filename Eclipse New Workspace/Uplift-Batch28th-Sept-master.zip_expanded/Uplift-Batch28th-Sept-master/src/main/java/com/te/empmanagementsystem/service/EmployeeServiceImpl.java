package com.te.empmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empmanagementsystem.dao.EmployeeDao;
import com.te.empmanagementsystem.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean register(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.register(employee);

		}
		return false;
	}

	@Override
	public Employee authenticate(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employee);

		}
		return null;
	}
}
