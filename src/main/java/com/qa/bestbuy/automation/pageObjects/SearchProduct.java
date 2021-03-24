package com.qa.bestbuy.automation.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.bestbuy.automation.helpers.CommonUtilities;

public class SearchProduct {
//Search product element identification, reusable methods implementation should be done here

	static WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities();
	public SearchProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='c-close-icon  c-modal-close-icon']")
	private WebElement popUp;

	@FindBy(xpath = "//input[@id='gh-search-input']")
	private WebElement searchProduct_txt;

	@FindBy(xpath = "//button[@title='submit search']")
	private WebElement searchButton_txt;

	public void popUp() throws InterruptedException, AWTException {
			
		Thread.sleep(2000);
		if(popUp.isDisplayed())
		{
			popUp.click();
			Thread.sleep(2000);
		}
		
		
	}

	public void searchProduct(String productName) {
		commonUtilities.enterText(driver, searchProduct_txt, productName);
	
	}
	
//	public void searchProducts() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		searchProduct_txt.sendKeys("iphone 12 pro");
//		
//	}

	public void searchButton() {
		commonUtilities.jsClick(driver, searchButton_txt);
	
	}

}
