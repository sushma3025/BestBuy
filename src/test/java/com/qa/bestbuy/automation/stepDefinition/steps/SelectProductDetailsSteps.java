package com.qa.bestbuy.automation.stepDefinition.steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.qa.bestbuy.automation.cucumber.TestContext;
import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.managers.WebDriverManager;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;
import com.qa.bestbuy.automation.pageObjects.SelectProductDetails;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class SelectProductDetailsSteps 

{
	
	TestContext  testContext;
	SelectProductDetails selectProductDetails;
	CommonUtilities commonUtilities;
	
	public SelectProductDetailsSteps(TestContext context){
		this.testContext = context;
		selectProductDetails = testContext.getPageObjectManager().getSelectProductDetailsPage();
		commonUtilities=testContext.getPageObjectManager().getCommonUtilities();

		
	}

	
	public WebDriver driver;
	//CommonUtilities commonUtilities = new CommonUtilities();
	//SelectProductDetails selectProductDetails = new SelectProductDetails(driver);
	
	@Then("^User Choose Options$")
	public void user_Choose_Options(DataTable testData) throws Throwable {
		Map<String, String> data = testData.asMap(String.class, String.class);
		
		if(data.containsKey("Type"))
		{
			selectProductDetails.selectPhone(data.get("Type"));
		}
		
		if(data.containsKey("Carrier"))
		{
			selectProductDetails.selectCarrierName(data.get("Carrier"));
		}
	   
		if(data.containsKey("Model"))
		{
			selectProductDetails.selectModel(data.get("Model"));
		}
		
		if(data.containsKey("Memory"))
		{
			selectProductDetails.selectMemory(data.get("Memory"));
		}
		
		if(data.containsKey("Color"))
		{
			selectProductDetails.selectColor(data.get("Color"));
		}
		if(data.containsKey("Options"))
		{
			selectProductDetails.selectOptions("Options");
		}
	}
	
//	@Then("^User Should be able to Select the Product$")
//	public void user_Should_be_able_to_Select_the_Product() throws Throwable {
//		selectProductDetails.selectPhone(commonUtilities.getproperties("phone"));
//
//	}
//
//	@Then("^User Should be able to Select the Carrier$")
//	public void user_Should_be_able_to_Select_the_Carrier() throws Throwable {
//		selectProductDetails.selectCarrierName(commonUtilities.getproperties("carrierName"));
//	}
//
//	@Then("^User Should be able to Select the Model$")
//	public void user_Should_be_able_to_Select_the_Model() throws Throwable {
//		selectProductDetails.selectModel(commonUtilities.getproperties("modelName"));
//	}
//
//	@Then("^User Should be able to Select the Memory$")
//	public void user_Should_be_able_to_Select_the_Memory() throws Throwable {
//		selectProductDetails.selectMemory(commonUtilities.getproperties("memory"));
//	}
//
//	@Then("^User Should be able to Select the Color$")
//	public void user_Should_be_able_to_Select_the_Color() throws Throwable {
//		selectProductDetails.selectColor(commonUtilities.getproperties("color"));
//	}

//	@Then("^User Should be able to Select the Options$")
//	public void user_Should_be_able_to_Select_the_Options() throws Throwable {
//		selectProductDetails.selectOptions(commonUtilities.getproperties("options"));
//	}

	@Then("^User Should be able to add item to Cart$")
	public void user_Should_be_able_to_add_item_to_Cart() throws Throwable {
		selectProductDetails.addItemToCart();
		selectProductDetails.createNewAccount();
		selectProductDetails.addAnotherDevice();
		selectProductDetails.transferPhoneNum();
		selectProductDetails.noTradeInContinue();

	}

	@Then("^User Should be able to select the plan$")
	public void user_Should_be_able_to_select_the_plan(DataTable testData) throws Throwable {
		
		Map<String, String> data = testData.asMap(String.class, String.class);
		selectProductDetails.unlimitedRadio(data.get("selectRadio"));

		//selectProductDetails.unlimitedRadio(commonUtilities.getproperties("selectRadio"));

	}

	@Then("^User Should be able to see the item in the cart$")
	public void user_Should_be_able_to_see_the_item_in_the_cart() throws Throwable {

		selectProductDetails.verifyMsg();
	}

}
