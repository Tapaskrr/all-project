package com.te.tablemapping.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.tablemapping.entity.Employee;
import com.te.tablemapping.services.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Employee employee) {

		try {
			
//			employeeServices.setSecondaryEmployee(employee);
//			employeeServices.setEducationalEmployee(employee);
			employeeServices.register(employee);
			return new ResponseEntity<String>("passed", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
		}
	}

}
