package com.te.employeemanagesystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.stereotype.Repository;

import com.te.employeemanagesystem.entity.Employee;
import com.te.employeemanagesystem.exception.MyException;


@Repository
public class MyDaoImpl implements MyDao {

	@Override
	public Boolean create(Employee employee) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new MyException("mydao error");
		}
	}

	@Override
	public Employee authenticate(Employee employee) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		Employee find = manager.find(Employee.class, employee.getEmpId());
		if (find != null) {
			if (find.getEmpPwd().equals(employee.getEmpPwd())) {
				return find;
			} else {
				throw new MyException("password is wrong");
			}
		} else {
			throw new MyException("id is wrong");
		}

	}

	@Override
	public Boolean update(Employee employee, String empId) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			Employee find = manager.find(Employee.class, empId);
			transaction.begin();
			find.setEmpMail(employee.getEmpMail());
			find.setEmpName(employee.getEmpName());
			find.setEmpPwd(employee.getEmpPwd());
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new MyException("mydao error");
		}
	}

	@Override
	public Boolean delete(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Employee find = manager.find(Employee.class, employee.getEmpId());
		if (find != null) {
			transaction.begin();
			manager.remove(find);
			transaction.commit();
			return true;
		} else {
			throw new MyException("sorry could not delete");
		}
	}

	@Override
	public List<Employee> allempdeatils() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		String q="from Employee";
		Query createQuery = manager.createQuery(q);
		List<Employee> resultList =  createQuery.getResultList();
		
		return resultList;
	}

}
