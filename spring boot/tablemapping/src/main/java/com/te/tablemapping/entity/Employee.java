package com.te.tablemapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private String empId;
	private String empName;
	private String empMail;
	private String empPwd;
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "employee")
	@JsonManagedReference
	private SecondaryInfo secondaryInfo;
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "employee")
	@JsonManagedReference
	private List<EductionalDetails> eductionalDetails;
}
