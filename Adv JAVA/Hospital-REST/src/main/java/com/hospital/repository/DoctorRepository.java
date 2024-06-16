package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	Doctor findByName(String name);

}
