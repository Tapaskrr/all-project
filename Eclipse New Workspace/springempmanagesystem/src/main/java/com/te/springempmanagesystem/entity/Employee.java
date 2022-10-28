package com.te.springempmanagesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_pwd")
	private String empPwd;
}
