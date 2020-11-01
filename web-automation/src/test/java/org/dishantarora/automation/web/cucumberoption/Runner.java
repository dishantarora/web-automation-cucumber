package org.dishantarora.automation.web.cucumberoption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/resources/feature"},
		glue={"org.dishantarora.automation.web.stepdefinitions"},
		dryRun=true,
		plugin= {"pretty"},
		monochrome=true)
public class Runner {

}