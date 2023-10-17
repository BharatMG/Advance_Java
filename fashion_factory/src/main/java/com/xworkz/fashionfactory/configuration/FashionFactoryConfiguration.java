package com.xworkz.fashionfactory.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class FashionFactoryConfiguration {
	Logger logger=LoggerFactory.getLogger(FashionFactoryConfiguration.class);

	public FashionFactoryConfiguration() {
		logger.info("FashionFactoryConfiguration constructor");
	}

	@Bean
	public ViewResolver viewResolver() {
		logger.info("viewResolver bean is created");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		logger.info("LocalContainerEntityManagerFactoryBean started");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		logger.info("bean created" + bean);
		return bean;

	}
}
