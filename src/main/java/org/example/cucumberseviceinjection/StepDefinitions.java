package org.example.cucumberseviceinjection;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//@CucumberContextConfiguration
public class StepDefinitions {

//	private final DummyService dummyService;
//
//	public StepDefinitions(DummyService dummyService) {
//		this.dummyService = dummyService;
//	}

	@Before
	public void before(Scenario scenario) {
		scenario.log("Before");
	}

	@Given("an example scenario")
	public void anExampleScenario() {

	}

	@Then("the scenario passes")
	public void theScenarioPasses() {
	}
}
