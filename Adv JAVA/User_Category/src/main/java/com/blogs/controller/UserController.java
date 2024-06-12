package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("In CTOR "+getClass());
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in login GET");
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String username, @RequestParam String password) {
		System.out.println("in login POST");
		return userService.validateUser(username, password) ? "/user/loggedin": "/user/login";
	}
}
