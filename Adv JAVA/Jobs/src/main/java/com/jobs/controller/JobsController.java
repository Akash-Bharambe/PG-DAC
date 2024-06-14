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

import com.jobs.DTO.APIResponse;
import com.jobs.entities.Job;
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
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getJob(id));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse(e.getMessage()));
		}
	}

	@PostMapping
	public ResponseEntity<?> addJob(@RequestBody Job job) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(service.addJob(job));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse(e.getMessage()));
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateJob(@PathVariable Long id, @RequestBody Job job) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.updateJob(id, job));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse(e.getMessage()));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteJob(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.deleteJob(id));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse(e.getMessage()));
		}
	}
	
}
