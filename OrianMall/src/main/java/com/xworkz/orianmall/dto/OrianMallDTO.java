package com.xworkz.orianmall.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@ToString
@Data
@Component
public class OrianMallDTO {
	
	private String productName;
	private String rating;
	private double price;
	private int quantity;
	private String reviews;
	
}