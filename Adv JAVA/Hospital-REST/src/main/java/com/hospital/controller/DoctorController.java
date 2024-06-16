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

import com.hospital.dto.DoctorDTO;
import com.hospital.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<?> getAllDoctors() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllDoctors());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDoctor(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getDoctor(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addDoctor(@RequestBody @Valid DoctorDTO doctorDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addDoctor(doctorDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDoctor(@PathVariable Long id, @RequestBody @Valid DoctorDTO doctorDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(service.updateDoctor(id, doctorDTO));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDoctor(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deleteDoctor(id));
	}
	
}
