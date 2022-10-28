package com.te.tablemapping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.tablemapping.dao.EmployeeDao;
import com.te.tablemapping.entity.EductionalDetails;
import com.te.tablemapping.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee register(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Boolean setSecondaryEmployee(Employee employee) {
		
		employee.getSecondaryInfo().setEmployee(employee);

		return true;
	}

	@Override
	public Boolean setEducationalEmployee(Employee employee) {

		for (EductionalDetails e : employee.getEductionalDetails()) {
			e.setEmployee(employee);
		}

		return true;
	}

}
