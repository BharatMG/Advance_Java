package com.xworkz.microsoft.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.microsoft.cofiguration.MicrosoftConfiguration;

public class MicrosoftController {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MicrosoftConfiguration.class);
		int beanCount = context.getBeanDefinitionCount();
		System.out.println(beanCount);

		String[] beanNames = context.getBeanDefinitionNames();
	for (String names : beanNames) {
		System.out.println(names);
	}
	}

}
