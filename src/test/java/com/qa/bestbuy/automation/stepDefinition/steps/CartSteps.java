package com.qa.bestbuy.automation.stepDefinition.steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.qa.bestbuy.automation.cucumber.TestContext;
import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.managers.WebDriverManager;
import com.qa.bestbuy.automation.pageObjects.Cart;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps {
	
	TestContext  testContext;
	Cart cart;
	CommonUtilities commonUtilities;
	public CartSteps(TestContext context){
		this.testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
		commonUtilities =testContext.getPageObjectManager().getCommonUtilities();
	}
	
	public WebDriver driver;
	//CommonUtilities commonUtilities = new CommonUtilities();
	//Cart cart = new Cart(driver);

	@When("^User Clicks on Cart$")
	public void user_Clicks_on_Cart() throws Throwable {
		cart.cartButton();

	}

	@Then("^user Should verify that the product is added to cart$")
	public void user_Should_verify__that_the_product_is_added_to_cart(DataTable testData) throws Throwable {
		Map<String, String> data = testData.asMap(String.class, String.class);
				
		cart.verifyCart(data.get("displayMessage"), data.get("model"));

	}

}
