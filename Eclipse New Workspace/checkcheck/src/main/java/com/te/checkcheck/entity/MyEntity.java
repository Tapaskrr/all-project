package com.te.checkcheck.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MyEntity implements Serializable {
	@Id
	private String empId;
	private String empName;
	private String empEmailId;
	private String empPwd;
	private String empAge;
	private String empDesignation;
	private String empBloodGroup;
	private String empDOB;
	private String empMaritalStatus;
	private String empGender;
	private String empDeptno;
	private String empStatus;
}
