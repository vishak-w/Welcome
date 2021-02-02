package com.example.updateTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

	@GetMapping("/")
	public ModelAndView sayHello() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}

}
