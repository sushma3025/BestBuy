package com.qa.bestbuy.automation.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilities 
{
	public void jsClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void jsSendkeys(WebDriver driver, WebElement ele, String name)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+ name +"';", ele);
	}
	
	public void jsScrollnClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		js.executeScript("arguments[0].click();", ele);	
	}

	public String getproperties(String prop) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:/NewWorkSpace/BestBuyProject/src/test/resources/configs/TestConfiguration.properties");
		Properties props = new Properties();
		props.load(fis);
	    String value = props.getProperty(prop);
	    					
	    return value;
	
	}
	
	public void enterText(WebDriver driver, WebElement element, String text )
	{
		element.clear();
		element.sendKeys(text);
	}
}
