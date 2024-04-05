package org.example.glue;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration
public class CucumberTestContext {

    @Configuration
    @ComponentScan(basePackages = "org.example.glue")
    public static class TestConfiguration {
    }
}
