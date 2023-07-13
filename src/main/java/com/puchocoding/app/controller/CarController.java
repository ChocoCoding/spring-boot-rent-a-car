package com.puchocoding.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.puchocoding.app.service.CarService;


@Controller
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping("/cars")
	public String showAllCars(Model model) {
		model.addAttribute("carsList",carService.getAll());
		return "cars";
	}
}
