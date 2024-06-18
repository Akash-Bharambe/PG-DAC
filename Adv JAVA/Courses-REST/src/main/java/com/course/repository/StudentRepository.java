package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.course.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query(value = "select s from Student s where s.course.name = :courseName")
	List<Student> findByCourseName(String courseName);
}
