package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogs.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	//depcy - service layer i/f
	@Autowired
	private CategoryService categoryService;
	
	public CategoryController() {
		System.out.println("in ctor "+getClass());
	}
	//add req handling method to ret list of categories
	//URL - http://host:port/ctx/categories/list , method=GET
	@GetMapping("/list")
	public String listCategories(Model map) {
		System.out.println("in list categories ");
		map.addAttribute("category_list",
				categoryService.getAllCategories());
		return "/categories/list";
		/*
		 * Handler --> LVN + model attr --> D.S
		 * D.S --> LVN -> V.R -> AVN -> D.S
		 * D.S -> adds model attr(list) under req scope -> forward 
		 * AVN -> /WEB-INF/views/categories/list.jsp
		 */
	}
	

}
