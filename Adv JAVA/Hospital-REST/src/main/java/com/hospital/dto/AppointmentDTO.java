package com.hospital.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentDTO {

	private DoctorDTO doctor;
	private PatientDTO patient;
	private LocalDateTime appointmentDateTime;
}
