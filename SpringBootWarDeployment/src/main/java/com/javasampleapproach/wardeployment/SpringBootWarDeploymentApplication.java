package com.javasampleapproach.wardeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class SpringBootWarDeploymentApplication  extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		SpringBootWarDeploymentApplication.addInitHooks(application.application());
        return application.sources(SpringBootWarDeploymentApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDeploymentApplication.class, args);
	}
	
	static void addInitHooks(SpringApplication application) {
		   application.addListeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
		       String version = event.getEnvironment().getProperty("java.runtime.version");
		       //log.info("Running with Java {}", version);
		       System.out.println("Running with Java " + version);
		   });
		}
}
