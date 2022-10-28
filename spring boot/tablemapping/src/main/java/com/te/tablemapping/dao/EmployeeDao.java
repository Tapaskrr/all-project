package com.te.tablemapping.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.tablemapping.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {


}
