package com.puchocoding.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class AppController {

	@GetMapping(value = {"","/","/index"})
	public String showStarterPage(Model model) {
		return "index";
	}
	
}
