package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "appointments")
public @Data class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentID;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@Column(name = "appointment_time", unique = true)
	private LocalDateTime appointmentTime;

	
	public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentTime) {
		super();
		this.doctor = doctor;
		this.patient = patient;
		this.appointmentTime = appointmentTime;
	}


	public Appointment() {
	}
	
}
