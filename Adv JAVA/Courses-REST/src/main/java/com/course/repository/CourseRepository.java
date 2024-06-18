package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	List<Course> findAllByNameContaining(String name);
}
