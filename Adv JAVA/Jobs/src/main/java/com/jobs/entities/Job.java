package com.jobs.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 30)
	private String jobTitle;
	
	@Column(length = 30)
	private String companyName;
	
	@Column(length = 30)
	private String location;
	
	@Column(length = 30)
	private String description;
	
	@Column(length = 30)
	private String requirements;
	
	@Column
	private double salary;
	
	@Column
	private LocalDate postingDate = LocalDate.now();
	
}
