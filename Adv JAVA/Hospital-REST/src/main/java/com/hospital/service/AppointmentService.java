package com.hospital.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.AppointmentDTO;
import com.hospital.entities.Appointment;
import com.hospital.entities.Doctor;
import com.hospital.entities.Patient;
import com.hospital.exceptions.AppointmentException;
import com.hospital.repository.AppointmentRepository;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.PatientRepository;

@Service
@Transactional
public class AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private PatientRepository patientRepository;

	public List<AppointmentDTO> getAllAppointments() {
		return appointmentRepository.findAll().stream().map(entity -> mapper.map(entity, AppointmentDTO.class))
				.collect(Collectors.toList());
	}

	public AppointmentDTO addAppointment(AppointmentDTO appointmentDTO) {

		Doctor doctor = doctorRepository.findByName(appointmentDTO.getDoctor().getName());
		Patient patient = patientRepository.findByName(appointmentDTO.getPatient().getName());

		Appointment appointment = mapper.map(appointmentDTO, Appointment.class);
		if (doctor != null) {
			appointment.setDoctor(doctor);
			appointment.setPatient(patient);
			System.out.println(appointment);
			appointment = appointmentRepository.save(appointment);
		} else {
			throw new AppointmentException("Please Enter patient and Doctor Names");
		}
		return mapper.map(appointment, AppointmentDTO.class);
	}

	public AppointmentDTO updateAppointment(Long id, AppointmentDTO appointmentDTO) {
		Appointment appointment = mapper.map(appointmentDTO, Appointment.class);
		appointment.setAppointment_id(id);

		Doctor doctor = doctorRepository.findByName(appointmentDTO.getDoctor().getName());
		Patient patient = patientRepository.findByName(appointmentDTO.getPatient().getName());

		if (doctor == null)
			throw new AppointmentException("Please Enter patient and Doctor Names");

		appointment.setDoctor(doctor);
		appointment.setPatient(patient);
		appointment = appointmentRepository.save(appointment);
		return mapper.map(appointment, AppointmentDTO.class);
	}

	public AppointmentDTO getAppointment(Long id) {
		return mapper.map(
				appointmentRepository.findById(id).orElseThrow(() -> new AppointmentException("Appointment Not Found")),
				AppointmentDTO.class);
	}

	public String deleteAppointment(Long id) {
		if (appointmentRepository.existsById(id))
			appointmentRepository.deleteById(id);
		else
			throw new AppointmentException("Appointment Do not Exist");
		return "Appointment Deleted Successfully...!!!";
	}

}
