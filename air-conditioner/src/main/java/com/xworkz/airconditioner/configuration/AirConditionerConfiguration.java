package com.xworkz.airconditioner.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class AirConditionerConfiguration {

	public AirConditionerConfiguration() {

	System.out.println("AirConditionerConfiguration constructor");
	
	}
}