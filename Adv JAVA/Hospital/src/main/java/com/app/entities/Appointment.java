package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "appointments")
public @Data class Appointment {
	
	@ManyToOne
	@JoinColumn(name = "doctor_id",nullable = false)
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "patient_id",nullable = false)
	private Patient patient;
	
	@Column(name = "appointment_time", unique = true)
	private LocalDateTime appointmentTime;
	
}
