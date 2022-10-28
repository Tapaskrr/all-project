package com.te.employeemanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employeemanagementsystem.dao.EmployeeDao;
import com.te.employeemanagementsystem.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployee(String empId) {

		return employeeDao.findByEmpId(empId);
	}

	@Override
	public List<Employee> getAll() {

		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee register(Employee employee) {
		return employeeDao.save(employee);
		
	}

	@Override
	public Boolean deletedata(String empId) {
		try {
			employeeDao.deleteById(empId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
