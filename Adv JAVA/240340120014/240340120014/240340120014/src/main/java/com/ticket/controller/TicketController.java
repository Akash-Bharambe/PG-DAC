package com.ticket.controller;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.dto.TicketDTO;
import com.ticket.dto.UpdateTicketDTO;
import com.ticket.entities.Status;
import com.ticket.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	// Controller Method to Add a new Ticket with response status 201
	@PostMapping
	public ResponseEntity<?> addNewTicket(@RequestBody @Valid TicketDTO newTicketDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.createTicket(newTicketDTO));
	}
	
	// Controller Method to Update an existing Ticket with response status 200
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTicket(@PathVariable Long id, @RequestBody @Valid UpdateTicketDTO updateTicketDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(ticketService.updateTicketDetails(id, updateTicketDTO));
	}
	
	// Controller Method to Get Open Tickets with response status 200
	@GetMapping
	public ResponseEntity<?> getOpenTickets(@PathParam(value = "status") Status status ) {
		return ResponseEntity.status(HttpStatus.OK).body(ticketService.getOpenTickets(status));
	}
	
	// Controller Method to get Ticket by ID with response status 200
	@GetMapping("/{id}")
	public ResponseEntity<?> getTicket(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(ticketService.getTicketById(id));
	}
	
	
}
