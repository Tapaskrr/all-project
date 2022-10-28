package com.te.checkcheck.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.checkcheck.entity.MyEntity;

@Repository
public class MySubDao implements MyDao {

	@Override
	public Boolean myDao(MyEntity myEntity) {

		try {
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager = managerFactory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(myEntity);
			transaction.commit();
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public MyEntity authenticate(MyEntity myEntity) {
		try {
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager = managerFactory.createEntityManager();
			entityManager.persist(myEntity);
			MyEntity findEntity = entityManager.find(MyEntity.class, myEntity.getEmpId());
			if (findEntity != null) {
				if (findEntity.getEmpPwd().equals(myEntity.getEmpPwd())) {
					return findEntity;
				} else {
					return null;
				}
			}else {
				return null;
			}

		} catch (Exception e) {
			return null;
		}
	}

}
