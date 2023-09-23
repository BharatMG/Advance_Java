package com.workz.marks.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.workz")
public class MarksConfiguration {

	public MarksConfiguration() {
		System.out.println("MarksConfiguration constructor");
	}

}
