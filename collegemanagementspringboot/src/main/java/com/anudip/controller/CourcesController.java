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

import com.anudip.entity.Courses;
import com.anudip.service.CoursesService;
import jakarta.validation.Valid;

@RestController
public class CourcesController {


	@Autowired
	CoursesService serv;
	
	@PostMapping("/Courses/addCourses")
	public ResponseEntity<Courses> saveCourses(@Valid @RequestBody Courses courses)    // response is give record to postman
	{
		return new ResponseEntity<Courses>(serv.addCoursesDetail(courses),HttpStatus.CREATED);
	}
	
	@GetMapping("/Courses/get/{cid}")
	public ResponseEntity<Courses> getCourses(@PathVariable("cid")  int cid)    // response is give record to postman
	{
		return new ResponseEntity<Courses>(serv.getCoursesDeatil(cid),HttpStatus.OK);
	}
	
	@DeleteMapping("/Courses/remove/{cid}")
	public ResponseEntity<String> deleteCourses(@PathVariable("cid")  int cid)    // response is give record to postman
	{
		serv.deleteCoursesDetail(cid);
		
		return new ResponseEntity<String>("Delete succefull..", HttpStatus.OK);
	}
	
	@PutMapping("/Courses/update/{cid}")
	public ResponseEntity<String> updatedCourses(@PathVariable("cid")  int cid,@Valid @RequestBody Courses courses)    // response is give record to postman
	{
		serv.updateCoursesDetail(courses, cid);
		
		return new ResponseEntity<String>("update succesfully..", HttpStatus.OK);
	}
	
}
