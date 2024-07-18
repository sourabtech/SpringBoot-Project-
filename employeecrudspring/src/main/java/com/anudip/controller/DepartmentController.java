package com.anudip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.entity.Department;
import com.anudip.serviceimplimentation.DepartmentServiceImp;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImp Service;
	
	@PostMapping("/adddept")
	public Department deptAdd(@RequestBody Department dept)
	{
		return Service.addDepartment(dept);
		
	}
	

}
