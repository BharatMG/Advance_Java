package com.xworkz.orianmall.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class OrianMallConfiguration {

	public OrianMallConfiguration() {
		System.out.println("OrianMallConfiguration constructor");
	}
}
