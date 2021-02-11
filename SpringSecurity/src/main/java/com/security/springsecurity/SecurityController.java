package com.security.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
	ModelAndView homeView = new ModelAndView("home");
	
	@GetMapping(path = "/homepage")
	public ModelAndView home() {
		return homeView;
	}
}
