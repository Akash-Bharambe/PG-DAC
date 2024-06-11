package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Singleton and Eager
@Controller // To tell SC, this class is a spring bean containing request handling logic
public class HelloController {

	public HelloController() {
		System.out.println("In CTOR" + getClass());
	}

	// Add Request Handling Method, to test MVC Flow
	/*
	 * SC adds entry in handler mapping bean
	 * key: /hello (value of Request Mapping Annotation)
	 * value: com.blogs.controller.sayHello 
	 * (Fully Qualified Controller Class name + method name)
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("in say Hello");
		return "/welcome";
		/*
		 * handler(= Request Handling Controller) method returns Logical View Name
		 * LVN (= Forward view name)=> Dispatcher Servlet => View Resolver =>
		 * Actual View Name(prefix + LVN + Suffix)
		 * AVN = /WEB-INF/views/welcome.jsp
		 */
	}
}
