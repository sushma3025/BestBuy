package com.qa.bestbuy.automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/resources/features/test.feature",glue={"com.qa.bestbuy.automation.stepDefinition"}, tags= {"@test"}, monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests
{

	
}
