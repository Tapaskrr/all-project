package com.te.hybernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();

//		employee.setEmpId(30);

		employee.setEmpName("aman");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(employee);

//		Employee find = createEntityManager.find(Employee.class,20);
//		System.out.println(find.getEmpName());

		transaction.commit();
	}
}
