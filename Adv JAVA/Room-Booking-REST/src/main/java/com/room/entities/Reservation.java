package com.room.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

@Entity @Getter @Setter @ToString @NoArgsConstructor
@Table(name = "reservations")
public class Reservation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reservationID;
	
	@Column(name = "guest_name",length = 20)
	private String guestName;
	
	@Column(name = "check_out_date")
	private LocalDate checkOutDate;
	
	@Column(name = "check_in_date")
	private LocalDate checkInDate;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
	@Column(name = "total_price")
	private double totalPrice;
}
