package com.te.springempmanagesystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springempmanagesystem.entity.Employee;

@Repository
public class MyDaoImplement implements MyDao {

	@Override

	public Boolean myDao(Employee employee) {
		try {
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = managerFactory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Employee srviceCheckMethod(Employee employee) {
		try {
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = managerFactory.createEntityManager();
			Employee find = manager.find(Employee.class, employee.getEmpName());
			
			if(find!=null) {
				if(find.getEmpPwd().equals(employee.getEmpPwd())) {
					return find;
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

}
