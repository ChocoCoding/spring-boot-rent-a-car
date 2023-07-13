package com.puchocoding.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puchocoding.app.model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
