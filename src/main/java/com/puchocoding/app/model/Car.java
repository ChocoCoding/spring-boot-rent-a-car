package com.puchocoding.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "license_plate", length = 7,nullable=false,unique=true)
	private String licensePlate;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Car(Long id, String licensePlate) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
	}

	public Car() {
		super();
	}

	public Car(Long id) {
		super();
		this.id = id;
	}

	public Car(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}
	
	
	
}
