package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		ServletInitializer.addInitHooks(application.application());
		return application.sources(WarDemoApplication.class);
	}
	
	static void addInitHooks(SpringApplication application) {
		   application.addListeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
		       String version = event.getEnvironment().getProperty("java.runtime.version");
		       //log.info("Running with Java {}", version);
		       System.out.println("From War Package Running with Java " + version);
		   });
		}

}
