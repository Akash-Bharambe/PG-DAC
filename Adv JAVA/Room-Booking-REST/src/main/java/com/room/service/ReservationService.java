package com.room.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.dto.ReservationDTO;
import com.room.entities.Reservation;
import com.room.repository.ReservationRepository;

@Service
@Transactional
public class ReservationService {

	@Autowired
	private ReservationRepository repository;

	@Autowired
	private ModelMapper mapper;

	public List<ReservationDTO> getAllReservations() {
		return repository.findAll().stream().map(entity -> mapper.map(entity, ReservationDTO.class))
				.collect(Collectors.toList());
	}

	public ReservationDTO getReservation(Long id) {
		return mapper.map(repository.findById(id), ReservationDTO.class);
	}

	public ReservationDTO addReservation(ReservationDTO reservationDTO) {
		return mapper.map(repository.save(mapper.map(reservationDTO, Reservation.class)), ReservationDTO.class);
	}

	public ReservationDTO updateReservation(Long id, ReservationDTO reservationDTO) {
		Reservation reservation = mapper.map(reservationDTO, Reservation.class);
		reservation.setReservationID(id);
		return mapper.map(repository.save(reservation), ReservationDTO.class);
	}
	
	public String deleteReservation(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Reservation Canceled Successfully";
		}
		throw new ReservationException("Reservation not found");
	}
}
