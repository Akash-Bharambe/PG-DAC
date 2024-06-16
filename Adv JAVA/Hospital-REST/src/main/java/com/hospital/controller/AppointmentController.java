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

import com.hospital.dto.AppointmentDTO;
import com.hospital.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService service;
	
	@GetMapping
	public ResponseEntity<?> getAllAppointments() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllAppointments());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAppointment(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAppointment(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addNewAppointment(@RequestBody @Valid AppointmentDTO appointmentDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addAppointment(appointmentDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAppointment(@PathVariable Long id, @RequestBody @Valid AppointmentDTO appointmentDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(service.updateAppointment(id,appointmentDTO));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteAppointment(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deleteAppointment(id));
	}
	
}
