package com.qa.bestbuy.automation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart 
{
	static WebDriver driver;
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[text()='Cart']") 
	private WebElement cart;
	
//	@FindBy(xpath = "//a[contains(text(),'Apple - iPhone 12 Pro Max 5G ')]" )
//	private WebElement verifyCart;
	
	
	public void cartButton() throws InterruptedException
	{
		cart.click();
		Thread.sleep(3000);
	}
	
	public void verifyCart(String display, String model)
	{
		WebElement cartItem = driver.findElement(By.xpath("//a[contains(text(),'Apple - "+model+" 5G ')]"));
		String actual = cartItem.getText().trim().toString();
		Assert.assertEquals(actual, display);
		System.out.println(""+model+ " is added to the cart and is verified successfully");
		driver.close();
	}

}
