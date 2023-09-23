package com.xworkz.microsoft.cofiguration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class MicrosoftConfiguration {

	public MicrosoftConfiguration() {
		System.out.println("MicrosoftConfiguration constructor");
	}

}
