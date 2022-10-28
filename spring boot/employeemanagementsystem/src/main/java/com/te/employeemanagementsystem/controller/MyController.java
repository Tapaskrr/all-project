package com.te.employeemanagementsystem.controller;

import com.te.employeemanagementsystem.entity.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.employeemanagementsystem.services.EmployeeService;

@RestController
@RequestMapping("/controller")
public class MyController {

	@Autowired
	private EmployeeService myService;
	
	@GetMapping("/getById/{empPwd}")
	public ResponseEntity<?> getbyId(@PathVariable String empPwd){
		if(myService.getEmployee(empPwd)!=null) {
			return new ResponseEntity<Employee>(myService.getEmployee(empPwd),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("id not found",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		if(myService.getAll()!=null) {
			return new ResponseEntity<List<Employee>>(myService.getAll(),HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("could not find anything",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Employee employee){
		if(employee!=null) {
			if(myService.register(employee)!=null) {
				return new ResponseEntity<Employee>(myService.register(employee),HttpStatus.OK);
			}
		}
		return new ResponseEntity<String>("could not saved",HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<?> delete(@PathVariable String empId){
		if(myService.deletedata(empId)) {
			return new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("could not delete",HttpStatus.BAD_REQUEST);
		}
	}
	
}
