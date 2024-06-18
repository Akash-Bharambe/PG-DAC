package com.automobile.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

	@NotBlank(message = "Username cannot be empty")
	private String username;
	
	@NotBlank(message = "Email cannot be empty")
	@Email
	private String email;
	
	@NotBlank(message = "Password cannot be empty")
	private String password;
	
	@NotBlank(message = "City cannot be empty")
	private String city;
	
	@NotBlank(message = "Contact Number cannot be empty")
	private String contactNumber;
}
