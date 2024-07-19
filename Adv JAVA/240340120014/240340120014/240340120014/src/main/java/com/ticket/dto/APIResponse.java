package com.ticket.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

// Data Transfer Object to Send Response Back to Client
@Getter @Setter 
public class APIResponse {

	private String message;
	private LocalDateTime timestamp;
	
	public APIResponse(String message) {
		this.message = message;
		this.timestamp = LocalDateTime.now();
	}
	
	
}
