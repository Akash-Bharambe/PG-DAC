package com.products.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class APIResponse {

	private String msgString;
	private LocalDateTime ts;
	
	public APIResponse(String msgString) {
		this.msgString = msgString;
		this.ts = LocalDateTime.now();
	}
	
}
