package com.recipe.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {

	private String message;
	private LocalDateTime ts;

	public ApiResponse(String message) {
		this.message = message;
		this.ts = LocalDateTime.now();
	}
	
	
}
