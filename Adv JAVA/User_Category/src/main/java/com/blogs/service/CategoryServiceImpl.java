package com.blogs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dao.CategoryDao;
import com.blogs.entities.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	//depcy - dao layer i/f
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}

}
