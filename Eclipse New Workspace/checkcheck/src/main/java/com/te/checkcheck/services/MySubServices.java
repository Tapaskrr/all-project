package com.te.checkcheck.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.checkcheck.dao.MySubDao;
import com.te.checkcheck.entity.MyEntity;

@Service
public class MySubServices implements MyServices {

	@Autowired
	private MySubDao mySubDao;

	@Override
	public Boolean myServices(MyEntity myEntity) {
		if (myEntity.getEmpId().startsWith("tys")) {
			return mySubDao.myDao(myEntity);
		}

		return false;
	}

	@Override
	public MyEntity authenticate(MyEntity myEntity) {
		
		
		
		if (myEntity.getEmpId().startsWith("tys")) {
			return mySubDao.authenticate(myEntity);
		}

		
		return null;
		
		
	}

}
