package com.qa.bestbuy.automation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.bestbuy.automation.helpers.CommonUtilities;

public class SelectProductDetails {

	static WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities();

	public SelectProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement selectContinue;

	@FindBy(xpath = "//button[@id='variaton-dropdown-Cell_Phones_Model_Family']")
	private WebElement selectModelFamily;

	@FindBy(xpath = "//button[@id='variaton-dropdown-Cell_Phones_Internal_Memory']")
	private WebElement selectMemoryDropdown;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCart;

	// create new account
	@FindBy(xpath = "//span[text()='Create a New Account']")
	private WebElement createAccount;

	// Yes or No Thanks
	@FindBy(xpath = "//span[text()='No Thanks']")
	private WebElement addAnotherDevice;

	// yes or no
	@FindBy(xpath = "//span[text()='No']")
	private WebElement transferPhnNum;

	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//span[text()='Continue Without Trade-In']")
	private WebElement continueNoTradein;

	@FindBy(xpath = "//span[text()='Your device has been added to your cart']")
	private WebElement ele;

	public void selectPhone(String phone) throws InterruptedException {
		WebElement selectPhone = driver.findElement(By.xpath("//a[text() = '" + phone + "']"));
		selectPhone.click();
		Thread.sleep(1000);
	}

	// 'Verizon'
	public void selectCarrierName(String carrierName) throws InterruptedException {

		WebElement selectCarrier = driver.findElement(By.xpath("//span/child::img[@alt='" + carrierName + "']"));
		selectCarrier.click();
		Thread.sleep(2000);
		selectContinue.click();
	}

	// 'Apple iPhone 12 Pro' [2]
	public void selectModel(String modelName) {
		selectModelFamily.click();
		WebElement selectModel = driver
				.findElement(By.xpath("//div[@class='c-rich-dropdown-wrapper']//p[text()='" + modelName + "']"));
		selectModel.click();
	}

	// 256GB
	public void selectMemory(String memory) {
		selectMemoryDropdown.click();
		WebElement selectMemory = driver.findElement(By.xpath("//span[contains(@aria-label,'" + memory + "')]"));
		commonUtilities.jsScrollnClick(driver, selectMemory);
		// selectMemory.click();

	}

	// 'Pacific Blue'
	public void selectColor(String color) {
		WebElement selectColor = driver.findElement(By.xpath("//a[contains(@aria-label,'" + color + "')]"));
		commonUtilities.jsScrollnClick(driver, selectColor);
		// selectColor.click();
	}

	// 'for 30 months '
	public void selectOptions(String options) {
		WebElement selectPricingOption = driver.findElement(By.xpath("//span[contains(text(),'" + options + "')]"));
		commonUtilities.jsScrollnClick(driver, selectPricingOption);
		// selectPricingOption.click();
	}

	public void addItemToCart() {
		addToCart.click();
	}

	public void createNewAccount() {
		createAccount.click();
	}

	public void addAnotherDevice() {
		if (addAnotherDevice.isDisplayed()) {
			addAnotherDevice.click();
		} else {
			return;
		}

	}

	public void transferPhoneNum() {
		transferPhnNum.click();
		continueButton.click();
	}

	public void noTradeInContinue() throws InterruptedException {
		continueNoTradein.click();
		Thread.sleep(10000);
	}

	// 'radio-1'
	public void unlimitedRadio(String selectRadio) throws InterruptedException {

		WebElement unlimitedPlan = driver
				.findElement(By.xpath("//input[@id='" + selectRadio + "']/following-sibling::i"));
		unlimitedPlan.click();
		continueButton.click();
		Thread.sleep(2000);

	}

	public void verifyMsg() {
		Assert.assertTrue(ele.getText().contains("added to your cart"));
		System.out.println("Item is Added to Cart");
	}

}

//phone
// @FindBy(xpath = "//a[text() = 'replacephone']")
//	@FindBy(xpath = "//a[text() = 'iPhone 12 Pro']")
//	private WebElement selectPhone;

//carrier name
// @FindBy(xpath = "//span/child::img[@alt='CarrierName']")
//	@FindBy(xpath = "//span/child::img[@alt='Verizon']")
//	private WebElement selectCarrier;

//index for model
// @FindBy(xpath = "(//span[contains(@aria-label,'modelName')])['index']")
//	@FindBy(xpath = "(//span[contains(@aria-label,'Apple iPhone 12 Pro')])[2]")
//	private WebElement selectModel;

//memory
// @FindBy(xpath = "//span[contains(@aria-label,'Memory in GB')]")
//	@FindBy(xpath = "//span[contains(@aria-label,'256GB')]")
//	private WebElement selectMemory;

//color
// @FindBy(xpath = "//a[contains(@aria-label,'Color')]")
//	@FindBy(xpath = "//a[contains(@aria-label,'Pacific Blue')]")
//	private WebElement selectColor;

//pricing option
//	@FindBy(xpath = "//span[contains(text(),'for 30 months ')]")
//	private WebElement selectPricingOption;

//radio select
// @FindBy(xpath = "//input[@id='SelectRadioButton']/following-sibling::i")
//	@FindBy(xpath = "//input[@id='radio-1']/following-sibling::i")
//	private WebElement unlimitedPlan;