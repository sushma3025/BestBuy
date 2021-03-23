package com.qa.bestbuy.automation.stepDefinition.steps;

import org.openqa.selenium.WebDriver;

import com.qa.bestbuy.automation.cucumber.TestContext;
import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.managers.WebDriverManager;
import com.qa.bestbuy.automation.pageObjects.Cart;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps {
	
	TestContext  testContext;
	Cart cart;
	
	public CartSteps(TestContext context){
		this.testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
	}
	
	public WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities();
	//Cart cart = new Cart(driver);

	@When("^User Clicks on Cart$")
	public void user_Clicks_on_Cart() throws Throwable {
		cart.cartButton();

	}

	@Then("^user Should verify the product is added to cart$")
	public void user_Should_verify_the_product_is_added_to_cart() throws Throwable {
		cart.verifyCart(commonUtilities.getproperties("display"), commonUtilities.getproperties("model"));

	}

}
