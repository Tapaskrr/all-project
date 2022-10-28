package com.te.employeemanagementsystem;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
public class EmployeeSkillInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillsId;
//	private Integer emp_Id;
	private String skill;
	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "emp_id1")
	private List<EmployeePrimaryInfo> skillInfo;
	
	
}
