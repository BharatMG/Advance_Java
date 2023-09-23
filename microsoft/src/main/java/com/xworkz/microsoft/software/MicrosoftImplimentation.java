package com.xworkz.microsoft.software;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MicrosoftImplimentation implements Software {

	public MicrosoftImplimentation() {
		System.out.println("MicrosoftImplimentation constructor");
	}

	@Bean
	@Override
	public boolean onSave() {
		System.out.println("MicrosoftImplimentation  save method ");
		return false;
	}

}
