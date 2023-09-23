package com.xworkz.orianmall.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.orianmall.configuration.OrianMallConfiguration;

public class OrianMallController {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(OrianMallConfiguration.class);
		int beanCount = context.getBeanDefinitionCount();
		System.out.println(beanCount);

		String[] beanNames = context.getBeanDefinitionNames();
		for (String names : beanNames) {
			System.out.println(names);
		}
	}
}
