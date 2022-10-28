package com.te.employeemanagementsystem;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class EmployeeAddressInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String addressType;
	private String houseNo;
	private String streetName;
	private String locality;
	private String state;
	private String country;
	private Integer pincode;
// can't write mapped by->object of this class is not present as variable in other
// EmployeePrimaryInfo has not a column " " that is mapped
// many to one can't have mappedby
	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "emp_id")
	private EmployeePrimaryInfo employeePrimaryInfo;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "emp_id1")
//	private EmployeePrimaryInfo employeePrimaryInfo1;

}
