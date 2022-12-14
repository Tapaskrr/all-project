package com.te.springcore.bean.hybrid;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Car implements Serializable {
	private int carId;
	@Autowired
	@Qualifier("engine")
	private Engine engine;

}
