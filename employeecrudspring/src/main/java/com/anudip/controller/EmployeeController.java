package com.anudip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.entity.Employee;
import com.anudip.serviceimplimentation.EmployeeServiceImpl;


@RestController //Accept the request
public class EmployeeController {
	
	 // http://localhost:8080/addEmp
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/addEmp")
	public Employee empAdd(@RequestBody Employee emp)
	{
		return service.addEmployee(emp);
		
	}

}





