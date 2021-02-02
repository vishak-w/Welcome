package com.example.updateTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String sayHello()
	{
		return "Welcome to my Home";
	}

}
