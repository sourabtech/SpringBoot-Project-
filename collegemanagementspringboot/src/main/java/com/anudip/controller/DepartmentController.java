package com.anudip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.entity.Department;
import com.anudip.service.DepartmentService;
import jakarta.validation.Valid;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService serv;
	
	@PostMapping("/Department/addDepartment")
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department)    // response is give record to postman
	{
		return new ResponseEntity<Department>(serv.addDepartmentDetail(department),HttpStatus.CREATED);
	}
	
	@GetMapping("/Department/get/{did}")
	public ResponseEntity<Department> getDepartment(@PathVariable("did")  int did)    // response is give record to postman
	{
		return new ResponseEntity<Department>(serv.getDepartmentDeatil(did),HttpStatus.OK);
	}
	
	@DeleteMapping("/Department/remove/{did}")
	public ResponseEntity<String> deleteDepartment(@PathVariable("did")  int did)    // response is give record to postman
	{
		serv.deleteDepartmentDetail(did);
		
		return new ResponseEntity<String>("Delete succefull..", HttpStatus.OK);
	}
	
	@PutMapping("/Department/update/{did}")
	public ResponseEntity<String> updatedDepartment(@PathVariable("did")  int did,@Valid @RequestBody Department department)    // response is give record to postman
	{
		serv.updateDepartmentDetail(department, did);
		
		return new ResponseEntity<String>("update succesfully..", HttpStatus.OK);
	}
	
}
