package com.hospital.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentDTO {
	@NotNull(message = "Doctor name CANNOT be NULL")
	private DoctorDTO doctor;
	@NotNull(message = "Patient name CANNOT be NULL")
	private PatientDTO patient;
	private LocalDateTime appointmentDateTime;
}
