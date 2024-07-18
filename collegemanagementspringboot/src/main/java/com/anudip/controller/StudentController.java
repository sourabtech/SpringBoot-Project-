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

import com.anudip.entity.Student;
import com.anudip.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	StudentService serv;
	
	@PostMapping("/Student/addStudent")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student)    // response is give record to postman
	{
		return new ResponseEntity<Student>(serv.addStudentDetail(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/Student/get/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid")  int sid)    // response is give record to postman
	{
		return new ResponseEntity<Student>(serv.getStudentDeatil(sid),HttpStatus.OK);
	}
	
	@DeleteMapping("/Student/remove/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid")  int sid)    // response is give record to postman
	{
		serv.deleteStudentDetail(sid);
		
		return new ResponseEntity<String>("Delete succefull..", HttpStatus.OK);
	}
	
	@PutMapping("/Student/update/{sid}")
	public ResponseEntity<String> updatedStudent(@PathVariable("sid")  int sid,@Valid @RequestBody Student student)    // response is give record to postman
	{
		serv.updateStudentDetail(student, sid);
		
		return new ResponseEntity<String>("update succesfully..", HttpStatus.OK);
	}
	
}
