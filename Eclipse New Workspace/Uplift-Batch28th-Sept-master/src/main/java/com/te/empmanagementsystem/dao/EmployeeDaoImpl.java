package com.te.empmanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import com.te.empmanagementsystem.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean register(Employee employee) {
		boolean isRegistered = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isRegistered;
	}

	@Override
	public Employee authenticate(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee employee2 = manager.find(Employee.class, employee.getEmpId());
		if(employee2!=null) {
			if(employee.getPassword().equals(employee2.getPassword())) {
				return employee2;
			}
		}
		return null;
	}
}
