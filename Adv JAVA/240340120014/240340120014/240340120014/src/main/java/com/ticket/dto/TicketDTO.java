package com.ticket.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.ticket.entities.Category;
import com.ticket.entities.Status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Data Transfer Object to Send Ticket Details to Client and also take new ticket details from client
@Getter @Setter @NoArgsConstructor @ToString
public class TicketDTO {
	
	@NotBlank(message = "Phone number cannot be Empty")
	private String phoneNumber;
	
	@NotNull(message = "Category cannot be empty")
	private Category category;
	
	@NotBlank(message = "Issue Details cannot be Empty")
	private String issueDetails;
	
	@JsonProperty(access = Access.READ_ONLY)
	private String resolutionDetails;
	
	@JsonProperty(access = Access.READ_ONLY)
	private Status status;
	
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime creationDateTime;
	
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime resolutionDateTime;
}
