package com.ticket.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.ticket.entities.Status;

import lombok.ToString;

import lombok.NoArgsConstructor;

import lombok.Setter;

import lombok.Getter;


//Data Transfer Object to accept updated ticket details from Client
@Getter @Setter @NoArgsConstructor @ToString
public class UpdateTicketDTO {

	@NotBlank(message = "Resolution details cannot be Empty")
	private String resolutionDetails;

	private Status status;
	
	@JsonProperty(access = Access.READ_WRITE)
	private LocalDateTime resolutionDateTime;

}
