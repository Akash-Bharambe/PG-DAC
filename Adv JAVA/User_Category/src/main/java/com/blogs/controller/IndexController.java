package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() {
		System.out.println("In CTOR" + getClass());
	}

	@GetMapping("/")
	public String testIndex(Model map) {
		System.out.println("In test Index Page");
		return "/index";
	}
	
}
