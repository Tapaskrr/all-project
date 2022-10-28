package com.te.tablemapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class EductionalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationPrimary;
	private String yop10;
	private String yop12;
	private String yopDegree;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	@JsonBackReference
	private Employee employee;
}
