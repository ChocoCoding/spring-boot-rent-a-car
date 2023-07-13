package com.puchocoding.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.puchocoding.app.commons.GenericServiceImpl;
import com.puchocoding.app.model.Car;
import com.puchocoding.app.repository.CarRepository;
import com.puchocoding.app.service.CarService;

@Service
public class CarServiceImpl extends GenericServiceImpl<Car, Long> implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public JpaRepository<Car, Long> getRepository() {
		return carRepository;
	}

}
