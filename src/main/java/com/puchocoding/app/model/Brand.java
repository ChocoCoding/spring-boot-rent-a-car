package com.puchocoding.app.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", length = 45,nullable=false,unique=true)
	private String name;
	
	@Column(name = "price_per_day", length = 45,nullable=false)
	private Integer pricePerDay;

	@OneToMany(mappedBy = "brand") //The mappedBy atributte references brand attribute created on Car
	private List<Car> cars;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Integer pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public Brand(Long id, String name, Integer pricePerDay) {
		super();
		this.id = id;
		this.name = name;
		this.pricePerDay = pricePerDay;
	}

	public Brand() {
		super();
	}

	public Brand(Long id) {
		super();
		this.id = id;
	}

	public Brand(String name, Integer pricePerDay) {
		super();
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
 
}
