package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Department;
import com.app.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Validated
public class DepartmentController {
	// dependency 
	@Autowired
	private DepartmentService departmentService;

		// get all department details
		// http://host:port/departments
		@GetMapping
		public List<Department> getAllDepartmentDetails() {
			System.out.println("in get all depts" );
			return departmentService.getAllDepartmens();
		}	

}
