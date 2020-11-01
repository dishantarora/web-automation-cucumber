package org.dishantarora.automation.web.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Homepage {
	
	@Given("^User has the homepage url.$")
	public void user_has_the_homepage_url() {
		System.out.println("Given Statement executed.");
	}
	
	@When("^User navigate to homepage url.$")
	public void user_navigate_to_homepage_url() {
		System.out.println("When Statement executed.");
	}
	
	@Then("^Homepage is populated.$")
	public void homepage_is_populated() {
		System.out.println("Then Statement executed.");
	}
	
	@Then("^Homepage title is \"(.*)\".$")
	public void verify_homepage_title(String title) {
		System.out.println("Homepage title is " + title);
	}
	
	@Then("^Pop-up is populated.$")
	public void pop_up_is_populated() {
		System.out.println("Second Then Statement executed.");
	}		
}