package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.entities.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	// dep
	@Autowired
	private DepartmentDao departmentDao;	

	@Override
	public List<Department> getAllDepartmens() {
		return departmentDao.findAll(); // List<Department>			
	}

	
}
