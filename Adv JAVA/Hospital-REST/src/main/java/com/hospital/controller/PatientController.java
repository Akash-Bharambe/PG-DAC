package com.hospital.controller;

import javax.validation.Valid;

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

import com.hospital.dto.PatientDTO;
import com.hospital.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService service;
	
	@GetMapping
	public ResponseEntity<?> getAllPatients() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllPatients());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPatient(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getPatient(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addPatient(@RequestBody @Valid PatientDTO patientDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addPatient(patientDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePatient(@PathVariable Long id, @RequestBody @Valid PatientDTO patientDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(service.updatePatient(id, patientDTO));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePatient(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deletePatient(id));
	}
	
}
