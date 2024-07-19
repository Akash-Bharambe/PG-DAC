package com.ticket.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Ticket Entity
@Entity
@Table(name = "tickets")
@Getter @Setter @NoArgsConstructor @ToString
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "phone_number", unique = true,length = 10)
	private String phoneNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "category", length = 9)
	private Category category;
	
	@Column(name = "issue_details")
	private String issueDetails;
	
	@Column(name = "resolution_details")
	private String resolutionDetails;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status", length = 11)
	private Status status;
	
	@CreationTimestamp
	private LocalDateTime creationDateTime;
	
	private LocalDateTime resolutionDateTime;
}
