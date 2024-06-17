package com.room.controller;

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

import com.room.dto.ReservationDTO;
import com.room.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	private ReservationService service;
	
	@GetMapping
	public ResponseEntity<?> getAllreservations() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllReservations());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getReservation(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.getReservation(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addreservation(@RequestBody ReservationDTO reservationDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(service.addReservation(reservationDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateReservation(@PathVariable Long id, @RequestBody @Valid ReservationDTO reservationDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(service.updateReservation(id,reservationDTO));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteReservation(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deleteReservation(id));
	}
}
