package com.room.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.room.entities.RoomType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RoomDTO {

	@NotBlank(message = "Room Number Cannot be Empty")
	private String roomNumber;
	
	@JsonProperty(access = Access.READ_ONLY)
	private RoomType roomType;

	@JsonProperty(access = Access.READ_ONLY)
	private double price;

	@JsonProperty(access = Access.READ_ONLY)
	private boolean available;
}
