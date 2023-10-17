package com.xworkz.fashionfactory.configuration;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FashionFactoryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	org.slf4j.Logger log = LoggerFactory.getLogger(FashionFactoryWebInit.class);

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("logger running F");
		return new Class[] { FashionFactoryConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("logger running ");
		return new String[] { "/" };
	}

}
