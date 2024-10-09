package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SpringbootController {

	
	@GetMapping("/")
	public String firstHandler() {
		System.out.println("This is Home Page");
		return "Home";
	}
	
}
