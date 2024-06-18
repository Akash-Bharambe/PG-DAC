package com.course.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.course.entities.Course;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {
	@NotBlank(message = "Name Cannot Be Blank")
	private String name;
	
	@Email
	@NotBlank(message = "Email Cannot Be Blank")
	private String email;
	
	@NotBlank(message = "Password Cannot Be Blank")
	private String password;

	@NotNull
	private Course course;
}
