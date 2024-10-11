package com.springboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringbootController {

	
	@GetMapping("/home")
	public String firstHandler() {
		System.out.println("This is Home Page");
		return "home";
	}
	
	@GetMapping("/contact")
	public String ContactHandler() {
		System.out.println("This is Contact Page");
		return "contact";
	}
	
}
