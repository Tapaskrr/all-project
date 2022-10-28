package com.te.tablemapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class SecondaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer secondryId;
	private String bloodGroup;
	private String maritalStatus;
	private String height;
	private String panCard;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private Employee employee;
}
