package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="projects")
@NoArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity {
	@Column(unique = true)
	private String title;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ProjectStatus status;
	private double budget;
	
	public Project(String title, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status=ProjectStatus.LAUNCHED;
	}
	public Project(String title) {
		super();
		this.title = title;
	}
}
