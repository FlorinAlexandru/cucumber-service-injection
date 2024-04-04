package org.example.cucumberseviceinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CucumberServiceInjectionApplication {

	private final CucumberTestRunner cucumberTestRunner;

	public CucumberServiceInjectionApplication(CucumberTestRunner cucumberTestRunner) {
		this.cucumberTestRunner = cucumberTestRunner;
	}


	public static void main(String[] args) {
		SpringApplication.run(CucumberServiceInjectionApplication.class, args);
	}

	@EventListener
	public void run(ApplicationStartedEvent event) {
		cucumberTestRunner.run();
	}
}
