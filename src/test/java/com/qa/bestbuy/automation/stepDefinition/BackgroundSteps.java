package com.qa.bestbuy.automation.stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.bestbuy.automation.cucumber.TestContext;
import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.managers.WebDriverManager;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundSteps {
//Login functionality should be implemented here
	
	
	WebDriver driver;
	TestContext  testContext;
	
	public BackgroundSteps(TestContext context){
		this.testContext = context;	
		driver = testContext.getWebDriverManager().getDriver();

	}
	
	//CommonUtilities commonUtilities = new CommonUtilities();
	//WebDriverManager webDriverManager = new WebDriverManager();
	
	@Given("^i should navigate to the home page$")
	public void i_should_navigate_to_the_home_page(DataTable testData) throws Throwable 
	{
		Map<String, String> data = testData.asMap(String.class, String.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(data.get("url"));  
	}
	@Then("^verify the page is launched$")
	public void verify_the_page_is_launched(DataTable testData) throws Throwable 
	{
		Map<String, String> data = testData.asMap(String.class, String.class);
		Assert.assertEquals(driver.getCurrentUrl(), data.get("url"));
		System.out.println("Browser Launched Successfully");
		Thread.sleep(3000);	
	}
	

}
