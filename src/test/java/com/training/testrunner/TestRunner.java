package com.training.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// this is with TestNG 
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/com/training/features"},
		glue = {"com.training.step", "com.training.hooks"}, 
		plugin = {
					"pretty", 
					"html:target/cucumber-html-report" , 
					"json:target/cucumber-json-report"
				}, 
		monochrome = true, 
		tags= {"@tag"}
)
public class TestRunner  extends AbstractTestNGCucumberTests {
	// this class will not have any code 
}
