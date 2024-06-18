package com.course.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "courses")
@Getter @Setter @NoArgsConstructor @ToString
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id",nullable = false)
	private Long id;
	
	@Column(name = "course_name", length = 20, nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "course_category",length = 20, nullable = false)
	private Category category;
	
	@Column(nullable = false)
	private LocalDate startDate;
	
	@Column(nullable = false)
	private LocalDate endDate;
	
	@Column(nullable = false)
	private double fees;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 1, nullable = false)
	private Grade gradeToPass;
	
	
	
}
