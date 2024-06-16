package com.hospital.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.DoctorDTO;
import com.hospital.entities.Doctor;
import com.hospital.exceptions.DoctorException;
import com.hospital.repository.DoctorRepository;

@Service
@Transactional
public class DoctorService {

	@Autowired
	private DoctorRepository repository;
	
	@Autowired
	private ModelMapper mapper;

	public List<DoctorDTO> getAllDoctors() {
		return repository.findAll().stream().map(entity -> mapper.map(entity, DoctorDTO.class)).collect(Collectors.toList());
	}

	public DoctorDTO getDoctor(Long id) {
		return mapper.map(repository.findById(id).orElseThrow(()->new DoctorException("Doctor not found")), DoctorDTO.class);
	}

	public DoctorDTO addDoctor(@Valid DoctorDTO doctorDTO) {
		return mapper.map(repository.save(mapper.map(doctorDTO, Doctor.class)), DoctorDTO.class);
	}
	
	public DoctorDTO updateDoctor(Long id,DoctorDTO doctorDTO) {
		Doctor doctor = mapper.map(doctorDTO, Doctor.class);
		if (repository.existsById(id)) {
			doctor.setDocterId(id);
			repository.save(doctor);			
			return mapper.map(doctor, DoctorDTO.class);
		}
		throw new DoctorException("Doctor Not Found");
	}
	
	public String deleteDoctor(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Doctor Deleted Successfully";
		}
		throw new DoctorException("Doctor Not Found");
	}
	
}
