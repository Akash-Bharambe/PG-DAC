package com.room.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReservationDTO {
	@NotBlank(message = "Guest Name Cannot be Empty")
	private String guestName;
	
	private LocalDate checkOutDate;
	private LocalDate checkInDate;
	
	@NotNull(message = "Room number cannot be empty")
	private RoomDTO room;
}
