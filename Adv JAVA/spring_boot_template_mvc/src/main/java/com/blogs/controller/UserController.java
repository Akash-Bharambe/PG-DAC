package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("In CTOR "+getClass());
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in login GET");
		return "/user/login";
	}
	
	@PostMapping("/login")
	public void processLoginForm(@RequestParam String username, @RequestParam String password) {
		System.out.println("in login POST");
		System.out.println(username);
		System.out.println(password);
	}
	
}
