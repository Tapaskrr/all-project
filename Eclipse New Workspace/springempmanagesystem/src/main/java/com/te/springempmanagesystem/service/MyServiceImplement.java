package com.te.springempmanagesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springempmanagesystem.dao.MyDao;
import com.te.springempmanagesystem.entity.Employee;

@Service
public class MyServiceImplement implements MyService {

	@Autowired
	private MyDao myDao;
	
	@Override
	public Boolean srviceMethod(Employee employee) {
		if(employee.getEmpName().startsWith("tys"))
			return myDao.myDao(employee);
		
		return false;
	}

	@Override
	public Employee srviceCheckMethod(Employee employee) {
		if(employee.getEmpName().startsWith("tys"))
			return myDao.srviceCheckMethod(employee);
		
		
		
		return null;
	}

}
