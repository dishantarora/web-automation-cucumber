package org.dishantarora.automation.web.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SimpleFormDemo {
	
	// Given statement User has the homepage url is comming from Homepage.java
	// When statement User navigates to homepage url is also coming from Homepage.java
	
	@When("^User clicks on Input Form naviagtion tab.$")
	public void user_clicks_on_input_form_navigation_tab() throws Throwable {
		System.out.println("User clicks on Input Form navigation tab.");
	}
	
	@When("^User clicks on Simple Form Demo dropdown item.$")
	public void user_clicks_on_simple_form_demo_dropdown_item() throws Throwable {
		System.out.println("User clicks on Simple Form Demo dropdown item.");
	}
	
	@When("^User fills the message text field with \"(.*)\".$")
	public void user_fills_the_message_text_field(String message) throws Throwable {
		System.out.println("User fills the message text field with " + message);
	}
	
	@When("^User clicks on Show Message button.$")
	public void user_clicks_on_show_message_button() throws Throwable {
		System.out.println("User clicks on Show Message button.");
	}
	
	@When("^User fills the a text field with ([0-9]\\d*).$")
	public void user_fills_the_a_text_field(int a) throws Throwable {
		System.out.println("User fills the a text field with " + a);
	}
	
	@When("^User fills the b text field with ([0-9]\\d*).$")
	public void user_fills_the_b_text_field(int b) throws Throwable {
		System.out.println("User fills the b text field with " + b);
	}
	
	@When("^User clicks on Get Total button.$")
	public void user_clicks_on_get_total_button() throws Throwable {
		System.out.println("User clicks on the Get Total.");
	}

	@Then("^Your message shows to \"(.*)\".$")
	public void verify_messsage(String message) throws Throwable {
		System.out.println("Message is " + message);
	}
	
	@Then("^Total shows to ([0-9]\\d*).$")
	public void verify_total(int total) throws Throwable {
		System.out.println("Total is " + total);
	}
}
