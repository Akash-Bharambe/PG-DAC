package com.jobs.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobDTO {
	
	private String jobTitle;
	private String companyName;
	private String location;
	private String description;
	private String requirements;
	private double salary;
}
