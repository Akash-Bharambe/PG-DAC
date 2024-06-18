package com.room.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.room.dto.ReservationDTO;
import com.room.entities.Reservation;
import com.room.entities.Room;
import com.room.exception.ReservationException;
import com.room.repository.ReservationRepository;
import com.room.repository.RoomRepository;

@Service
@Transactional
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private ModelMapper mapper;

	public List<ReservationDTO> getAllReservations() {
		List<Reservation> list2 = reservationRepository.findAll();
		System.out.println(list2);
		List<ReservationDTO> list = list2.stream().map(entity -> mapper.map(entity, ReservationDTO.class))
				.collect(Collectors.toList());
		System.out.println(list);
		return list;
	}

	public ReservationDTO getReservation(Long id) {
		if (reservationRepository.existsById(id))
			return mapper.map(reservationRepository.findById(id).orElseThrow(), ReservationDTO.class);
		throw new ReservationException("Reservation not available");

	}

	public ReservationDTO addReservation(ReservationDTO reservationDTO) {

		Room room = roomRepository.findByRoomNumber(reservationDTO.getRoom().getRoomNumber());

		Reservation reservation = mapper.map(reservationDTO, Reservation.class);
		reservation.setRoom(room);

		return mapper.map(reservationRepository.save(reservation), ReservationDTO.class);
	}

	public ReservationDTO updateReservation(Long id, ReservationDTO reservationDTO) {
		if (reservationRepository.existsById(id)) {

			Room room = roomRepository.findByRoomNumber(reservationDTO.getRoom().getRoomNumber());
			Reservation reservation = reservationRepository.findById(id).orElseThrow();
			
			mapper.map(reservationDTO, reservation);
			reservation.setRoom(room);
			return mapper.map(reservationRepository.save(reservation), ReservationDTO.class);
		}
		throw new ReservationException("Reservation not found");
	}

	public String deleteReservation(Long id) {
		if (reservationRepository.existsById(id)) {
			reservationRepository.deleteById(id);
			return "Reservation Canceled Successfully";
		}
		throw new ReservationException("Reservation not found");
	}
}
