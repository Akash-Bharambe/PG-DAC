package com.hospital.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.PatientDTO;
import com.hospital.entities.Patient;
import com.hospital.exceptions.PatientException;
import com.hospital.repository.PatientRepository;

@Service
@Transactional
public class PatientService {

	@Autowired
	private PatientRepository repository;
	
	@Autowired
	private ModelMapper mapper;

	public List<PatientDTO> getAllPatients() {
		return repository.findAll().stream().map(entity -> mapper.map(entity, PatientDTO.class)).collect(Collectors.toList());
	}

	public PatientDTO getPatient(Long id) {
		return mapper.map(repository.findById(id).orElseThrow(()->new PatientException("Patient not found")), PatientDTO.class);
	}

	public PatientDTO addPatient(@Valid PatientDTO patientDTO) {
		return mapper.map(repository.save(mapper.map(patientDTO, Patient.class)), PatientDTO.class);
	}
	
	public PatientDTO updatePatient(Long id,PatientDTO patientDTO) {
		Patient patient = mapper.map(patientDTO, Patient.class);
		if (repository.existsById(id)) {
			patient.setPatientId(id);
			repository.save(patient);			
			return mapper.map(patient, PatientDTO.class);
		}
		throw new PatientException("Patient Not Found");
	}
	
	public String deletePatient(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Patient Deleted Successfully";
		}
		throw new PatientException("Patient Not Found");
	}
	
}
