package com.course.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.dto.CourseDTO;
import com.course.dto.StudentDTO;
import com.course.dto.UpdateCourseDTO;
import com.course.entities.Course;
import com.course.entities.Grade;
import com.course.entities.Student;
import com.course.exception.CourseException;
import com.course.repository.CourseRepository;
import com.course.repository.StudentRepository;

@Service
@Transactional
public class CourseService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private ModelMapper mapper;

	public List<StudentDTO> getStudentByCourse(String courseName) {
		List<Student> findByCourseName = studentRepository.findByCourseName(courseName);
		List<StudentDTO> students = findByCourseName.stream().map(e -> mapper.map(e, StudentDTO.class))
				.collect(Collectors.toList());
		return students;
	}

	public CourseDTO addNewCourse(@Valid CourseDTO courseDTO) {
		System.out.println("addNewCourse");
		if (courseDTO.getStartDate().isBefore(courseDTO.getEndDate())) {
			Course course = mapper.map(courseDTO, Course.class);
			course.setGradeToPass(Grade.D);
			return mapper.map(courseRepository.save(course), CourseDTO.class);
		}
		throw new CourseException("Course Start Date has to be before Course End Date");
	}

	public CourseDTO updateCourse(Long id,@Valid UpdateCourseDTO courseDTO) {
		if (!courseRepository.existsById(id)) {
			throw new CourseException("Course Not Found");
		}
		if (courseDTO.getStartDate().isBefore(courseDTO.getEndDate())) {
			Course course = courseRepository.findById(id).orElseThrow(()->new CourseException("Course Not Found"));
			mapper.map(courseDTO, course);
			return mapper.map(courseRepository.save(course), CourseDTO.class);
		}
		throw new CourseException("Course Start Date has to be before Course End Date");
	}
	
	public List<CourseDTO> getCourseByName(String courseName) {
		List<Course> findByName = courseRepository.findAllByNameContaining(courseName);
		List<CourseDTO> list = findByName.stream().map(entity-> mapper.map(entity, CourseDTO.class)).collect(Collectors.toList());
		return list;
	}

}
