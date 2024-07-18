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

import com.anudip.entity.Batches;
import com.anudip.service.BatchesService;
import jakarta.validation.Valid;

@RestController
public class BatchesController {

	

	@Autowired
	BatchesService serv;
	
	@PostMapping("/Batches/addBatches")
	public ResponseEntity<Batches> saveBatches(@Valid @RequestBody Batches batches)    // response is give record to postman
	{
		return new ResponseEntity<Batches>(serv.addBatchesDetail(batches),HttpStatus.CREATED);
	}
	
	@GetMapping("/Batches/get/{bid}")
	public ResponseEntity<Batches> getBatches(@PathVariable("bid")  int bid)    // response is give record to postman
	{
		return new ResponseEntity<Batches>(serv.getBatchesDeatil(bid),HttpStatus.OK);
	}
	
	@DeleteMapping("/Batches/remove/{bid}")
	public ResponseEntity<String> deleteBatches(@PathVariable("bid")  int bid)    // response is give record to postman
	{
		serv.deleteBatchesDetail(bid);
		
		return new ResponseEntity<String>("Delete succefull..", HttpStatus.OK);
	}
	
	@PutMapping("/Batches/update/{bid}")
	public ResponseEntity<String> updatedBatches(@PathVariable("bid")  int bid,@Valid @RequestBody Batches batches)    // response is give record to postman
	{
		serv.updateBatchesDetail(batches, bid);
		
		return new ResponseEntity<String>("update succesfully..", HttpStatus.OK);
	}
	
}
