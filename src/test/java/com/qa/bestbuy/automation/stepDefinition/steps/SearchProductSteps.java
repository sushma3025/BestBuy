package com.qa.bestbuy.automation.stepDefinition.steps;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.bestbuy.automation.cucumber.TestContext;
import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.managers.WebDriverManager;
import com.qa.bestbuy.automation.pageObjects.Cart;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProductSteps {
//Search Product implementation to be done here

	
	TestContext  testContext;
	SearchProduct searchProduct;
	
	public SearchProductSteps(TestContext context){
		this.testContext = context;
		searchProduct = testContext.getPageObjectManager().getSearchProductPage();
	}
	
	CommonUtilities commonUtilities = new CommonUtilities();
	//SearchProduct searchProduct = new SearchProduct(driver);
	
	

	@Given("^User Launches the Application and Clicks On PopUp$")
	public void user_Launches_the_Application_and_Clicks_On_PopUp() throws InterruptedException, AWTException
	{
		searchProduct.popUp();
	}
	@When("^User Enters text in the SearchBox$")
	public void user_Enters_text_in_the_SearchBox() throws IOException, InterruptedException 
	{
		searchProduct.searchProduct(commonUtilities.getproperties("text"));
		System.out.println("Entered the productName");
	   
	}

	@When("^User Clicks on Search button$")
	public void user_Clicks_on_Search_button() throws Throwable {
		searchProduct.searchButton();

	}

	
	

}
