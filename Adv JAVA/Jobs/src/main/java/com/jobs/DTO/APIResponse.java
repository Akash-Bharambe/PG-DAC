package com.jobs.DTO;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
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
