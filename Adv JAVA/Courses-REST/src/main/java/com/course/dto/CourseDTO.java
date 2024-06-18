package com.course.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.course.entities.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CourseDTO {
	@NotBlank(message = "Name Cannot be Blank")
	private String name;

	@NotNull(message = "Category Cannot be Blank")
	private Category category;

	@NotNull(message = "Start Date Cannot be Blank")
	private LocalDate startDate;

	@NotNull(message = "End Date Cannot be Blank")
	private LocalDate endDate;

	@Range(min = 100)
	private double fees;

}
