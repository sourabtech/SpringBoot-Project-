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
import com.anudip.entity.Teacher;
import com.anudip.service.TeacherService;
import jakarta.validation.Valid;


@RestController   // @controller + @Request body
public class TeacherController {
	
	@Autowired
	private TeacherService tservice;
	
		
		
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher)    // response is give record to postman
	{
		return new ResponseEntity<Teacher>(tservice.addTeacherDetail(teacher),HttpStatus.CREATED);
	}

	@GetMapping("/Teacher/get/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid")  int tid)    // response is give record to postman
	{
		return new ResponseEntity<Teacher>(tservice.getTeacherDeatil(tid),HttpStatus.OK);
	}
	
	@DeleteMapping("/Teacher/remove/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid")  int tid)    // response is give record to postman
	{
		tservice.deleteTeacherDetail(tid);
		
		return new ResponseEntity<String>("Delete succefull..", HttpStatus.OK);
	}
	@PutMapping("/Teacher/update/{tid}")
	public ResponseEntity<String> updatedTeacher(@PathVariable("tid")  int tid,@Valid @RequestBody Teacher teacher)    // response is give record to postman
	{
		tservice.updateTeacherDetail(teacher, tid);
		
		return new ResponseEntity<String>("update succesfully..", HttpStatus.OK);
	}
	
	
	
	
	
}

