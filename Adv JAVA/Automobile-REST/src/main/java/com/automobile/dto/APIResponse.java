package com.automobile.dto;

import java.time.LocalDateTime;


public class APIResponse {
	
	private String message;
	private LocalDateTime ts;
	public APIResponse(String message) {
		this.message = message;
		this.ts = LocalDateTime.now();
	}

}
