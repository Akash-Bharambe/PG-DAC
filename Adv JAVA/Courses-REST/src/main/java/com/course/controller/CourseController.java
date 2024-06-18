package com.course.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.dto.CourseDTO;
import com.course.dto.UpdateCourseDTO;
import com.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/{courseName}")
	public ResponseEntity<?> getStudentsByCourse(@PathVariable String courseName) {
		return ResponseEntity.status(HttpStatus.OK).body(courseService.getStudentByCourse(courseName));
	}
	
	@PostMapping
	public ResponseEntity<?> addNewCourse(@RequestBody @Valid CourseDTO courseDTO) {
		System.out.println("addNewCourse");
		return ResponseEntity.status(HttpStatus.CREATED).body(courseService.addNewCourse(courseDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCourse(@PathVariable Long id,@RequestBody @Valid UpdateCourseDTO courseDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(courseService.updateCourse(id,courseDTO));
	}
	
	@GetMapping("/name/{courseName}")
	public ResponseEntity<?> getCourseByName(@PathVariable String courseName) {
		return ResponseEntity.status(HttpStatus.OK).body(courseService.getCourseByName(courseName));
	}
	
}
