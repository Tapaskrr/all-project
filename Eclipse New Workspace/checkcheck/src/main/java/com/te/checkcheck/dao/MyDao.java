package com.te.checkcheck.dao;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.te.checkcheck.entity.MyEntity;

public interface MyDao {
	
	public Boolean myDao(MyEntity myEntity);
	
	public MyEntity authenticate(MyEntity myEntity);

}
