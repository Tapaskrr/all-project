package com.te.restfull.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.restfull.dao.MyDao;
import com.te.restfull.entity.Employee;
import com.te.restfull.exception.MyException;

@Service
public class MyServiceImpl implements MyService {
	@Autowired
	private MyDao myDao;

	@Override
	public Boolean create(Employee employee) {
		if(employee.getEmpId().startsWith("tys")) {
			return myDao.create(employee);
		}
		else {
			throw new MyException("id is not started with tys");
		}
		
		
		
	}

	@Override
	public Employee authenticate(Employee employee) {
		if(employee.getEmpId().startsWith("tys")) {
			Employee authenticate = myDao.authenticate(employee);
			if(authenticate!=null) {
				return authenticate;
		}
		else {
			throw new MyException("dao went wrong from service");
		}
	}else {
		throw new MyException("id is not started with tys");
	}
}

	@Override
	public Boolean update(Employee employee,String empId) {
		
			return myDao.update(employee,empId);
	}

	@Override
	public Boolean delete(String empId) {
		return myDao.delete(empId);
		
	}

	@Override
	public List<Employee> allempdeatils() {
		
		return myDao.allempdeatils();
	}
}
