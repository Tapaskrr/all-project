package com.te.employeemanagementsystem;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	private Integer empId;
	private String empName;
	private Integer empAge;
	private String empDesignation;
	private String empBloodGroup;
	private String empEmail;
	private String empDob;
	private String empMaritalStatus;
	private String empGender;
	private Integer empDeptNo;
// EmployeeAddressInfo has a column employeePrimaryInfo that is mapped
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeAddressInfo> empAddressInfos;
// restrict creation of another table
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "skillInfo" )
	private List<EmployeeSkillInfo> empSkillInfo;
}
