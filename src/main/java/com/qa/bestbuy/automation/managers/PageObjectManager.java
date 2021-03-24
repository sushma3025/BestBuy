package com.qa.bestbuy.automation.managers;

import org.openqa.selenium.WebDriver;

import com.qa.bestbuy.automation.helpers.CommonUtilities;
import com.qa.bestbuy.automation.pageObjects.Cart;
import com.qa.bestbuy.automation.pageObjects.SearchProduct;
import com.qa.bestbuy.automation.pageObjects.SelectProductDetails;

public class PageObjectManager {
	private WebDriver driver;
	private SearchProduct searchProduct;
	private SelectProductDetails selectProductDetails;
	private Cart cart;
	private CommonUtilities commonUtilities;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

    public SearchProduct getSearchProductPage()
    {
	return (searchProduct ==null) ? searchProduct = new SearchProduct(driver) : searchProduct ;
    }
    
    public SelectProductDetails getSelectProductDetailsPage()
    {
    	return (selectProductDetails ==null) ? selectProductDetails = new SelectProductDetails(driver):selectProductDetails;
    }
    
    public Cart getCartPage()
    {
    	return (cart ==null) ? cart = new Cart(driver):cart;
    }
    public CommonUtilities getCommonUtilities()
    {
		return (commonUtilities == null) ? commonUtilities = new CommonUtilities(): commonUtilities;
    	
    }
    

}
