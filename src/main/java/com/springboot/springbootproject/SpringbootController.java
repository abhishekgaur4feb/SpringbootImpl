package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SpringbootController {

	
	@GetMapping("/test")
	public String firstHandler() {
		return "Just for testing";
	}
	
}
