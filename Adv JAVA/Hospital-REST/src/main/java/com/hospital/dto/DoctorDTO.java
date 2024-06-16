package com.hospital.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDTO {
	@NotBlank(message = "Doctor name CANNOT be NULL")
	private String name;
}
