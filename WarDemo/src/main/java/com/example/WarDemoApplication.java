package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@RestController
public class WarDemoApplication extends SpringBootServletInitializer {
	
//	@GetMapping("/test")
//	public String test() {
//		return "Application Deployed";
//	}
	

	public static void main(String[] args) {
		SpringApplication.run(WarDemoApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		addInitHooks(builder.application());
        return builder.sources(WarDemoApplication.class);
    }
	
	static void addInitHooks(SpringApplication application) {
		   application.addListeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
		       String version = event.getEnvironment().getProperty("java.runtime.version");
		       //log.info("Running with Java {}", version);
		       System.out.println("From War Package Running with Java " + version);
		   });
		}

}
