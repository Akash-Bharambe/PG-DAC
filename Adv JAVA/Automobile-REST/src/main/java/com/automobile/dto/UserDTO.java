package com.automobile.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

	@NotBlank
	private String username;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String city;
	
	@NotBlank
	private String contactNumber;
}
