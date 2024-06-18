package com.course.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Setter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @NoArgsConstructor
public class UpdateCourseDTO {
	@NotNull(message = "Start Date Cannot be Blank")
	private LocalDate startDate;

	@NotNull(message = "End Date Cannot be Blank")
	private LocalDate endDate;

	@Range(min = 100)
	private double fees;
}
