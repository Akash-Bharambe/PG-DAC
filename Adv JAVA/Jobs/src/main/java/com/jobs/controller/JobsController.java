package com.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.DTO.JobDTO;
import com.jobs.service.JobsService;

@RestController
@RequestMapping("/jobs")
public class JobsController {

	@Autowired
	private JobsService service;

	@GetMapping
	public ResponseEntity<?> getAllJobs() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllJobs());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getJob(@PathVariable Long id) {

		return ResponseEntity.status(HttpStatus.OK).body(service.getJob(id));
	}

	@PostMapping
	public ResponseEntity<?> addJob(@RequestBody JobDTO jobDTO) {

		return ResponseEntity.status(HttpStatus.CREATED).body(service.addJob(jobDTO));

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateJob(@PathVariable Long id, @RequestBody JobDTO jobDTO) {

		return ResponseEntity.status(HttpStatus.OK).body(service.updateJob(id, jobDTO));

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteJob(@PathVariable Long id) {

		return ResponseEntity.status(HttpStatus.OK).body(service.deleteJob(id));

	}
	
	@GetMapping("/salary/{salary}")
	public ResponseEntity<?> getBySalaryMoreThan(@PathVariable Double salary) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getBySalaryMoreThan(salary));
		
	}

}
