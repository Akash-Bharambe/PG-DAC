package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
