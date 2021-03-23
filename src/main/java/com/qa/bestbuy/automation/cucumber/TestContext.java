package com.qa.bestbuy.automation.cucumber;

import com.qa.bestbuy.automation.managers.PageObjectManager;
import com.qa.bestbuy.automation.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
   

    public TestContext() {
    webDriverManager = new WebDriverManager();
	pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	
    }

    public PageObjectManager getPageObjectManager() {
	return pageObjectManager;
    }

    public WebDriverManager getWebDriverManager()
    {
    	return webDriverManager;
    }
}
