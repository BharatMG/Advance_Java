package com.xworkz.airconditioner.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Component
@ToString
public class AirConditionerDTO {
	
	private String name;
	private String brand ;
	private double price ;
	private String color;
	
	
	public AirConditionerDTO(String name, String brand, double price, String color) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	
	
	
}
