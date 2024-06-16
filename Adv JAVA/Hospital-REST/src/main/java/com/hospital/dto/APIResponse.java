package com.hospital.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIResponse {

	private String message;
	private LocalDateTime ts;
	
	public APIResponse(String message) {
		this.message = message;
		this.ts = LocalDateTime.now();
	}
	
	
	
}
