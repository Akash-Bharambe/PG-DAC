package com.room.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.room.entities.RoomType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {
	@NotBlank(message = "Room Number Cannot Be Empty")
	private String roomNumber;
	@NotNull(message = "Room Type Cannot Be Empty")
	private RoomType roomType; 
	private double price;
	private boolean available;
	
}
