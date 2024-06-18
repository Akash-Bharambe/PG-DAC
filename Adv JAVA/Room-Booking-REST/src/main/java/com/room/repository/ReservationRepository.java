package com.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
