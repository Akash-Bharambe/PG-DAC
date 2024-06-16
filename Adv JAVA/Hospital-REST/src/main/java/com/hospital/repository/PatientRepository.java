package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	Patient findByName(String name);

}
