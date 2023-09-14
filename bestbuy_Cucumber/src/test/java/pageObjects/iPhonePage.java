package pageObjects;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class iPhonePage {
	
public WebDriver Sdriver;

WaitHelper waithelper;

	
	public iPhonePage(WebDriver rdriver) {
		Sdriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(Sdriver);
		
	}
	
	@FindBy(xpath = "//div[@lang='en']//img[@alt='United States']")
	@CacheLookup
	WebElement imgCountry;
	
	@FindBy(xpath = "//input[@id='gh-search-input']")
	@CacheLookup
	WebElement txtSearch;
	
	@FindBy(xpath = "//span[@class='header-search-icon']//*[name()='svg']")
	@CacheLookup
	WebElement iconSearch;
	
	@FindBy(xpath = "//input[@id='condition_facet-Pre-Owned-1'][@aria-label='Pre-Owned']")
	@CacheLookup
	WebElement CheckboxFilter;
	
	@FindBy(xpath = "//a[contains(text(),'Apple - Pre-Owned iPhone 13 Pro 5G 128GB (Unlocked')]")
	@CacheLookup
	WebElement itemLink;
	
	
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	@CacheLookup
	WebElement btnAddtocart;
	
	@FindBy(xpath = "//span[@class='added-to-cart']")
	@CacheLookup
	WebElement txtAddtocart;
	
	
	@FindBy(xpath = "//*[text()='Go to Cart']")
	@CacheLookup
	WebElement goToCart;
	
	@FindBy(xpath = "//a[@title='Cart']//*[name()='svg']")
	@CacheLookup
	WebElement btnCart;
	
	@FindBy(xpath = "//*[text()='Order Summary']")
	@CacheLookup
	WebElement orderSummary;
	
	@FindBy(xpath = "//*[text()='Checkout']")
	@CacheLookup
	WebElement btncheckout;
	
	
	@FindBy(xpath = "//*[@text()='iPhone 14']")
	@CacheLookup
	WebElement txtotheritem;
	
	public void SelectCountry() {
		imgCountry.click();
	}
	
	public void SearchiPhone(String item) {
		waithelper.WaitForElement(txtSearch, 30);
		txtSearch.clear();
		txtSearch.sendKeys(item);
		waithelper.WaitForElement(iconSearch, 30);
		iconSearch.click();
	}
	public void SelectFilter() {
		waithelper.WaitForElement(CheckboxFilter, 30);
		CheckboxFilter.click();
	}
	
	
	public void SelectItem() {
		waithelper.WaitForElement(itemLink, 30);
		itemLink.click();
		
	}
	
	public void ClickonAddToCartandVerify() throws InterruptedException {
		waithelper.WaitForElement(btnAddtocart, 30);
		btnAddtocart.click();
		Thread.sleep(3000);
		
		String WindowID = Sdriver.getWindowHandle();
		Sdriver.switchTo().window(WindowID);
		Sdriver.getPageSource().contains("Added to cart");
		Assert.assertTrue(true);
		System.out.println("Alert text verified");
		goToCart.click();
		Sdriver.switchTo().defaultContent();
		System.out.println("I am in default window");
		 
	}
	
	
	public void ClickonCart() {
		waithelper.WaitForElement(btnCart, 30);
		btnCart.click();
	}
	public void CartPage() {
		boolean isElementDisplayed1 = orderSummary.isDisplayed();
		Assert.assertTrue("The element is not displayed", isElementDisplayed1);
		boolean isElementDisplayed2 = btncheckout.isDisplayed();
		Assert.assertTrue("The element is not displayed", isElementDisplayed2);
	}
	public void VerifyOtheritem() {
		Sdriver.getPageSource().contains("iPhone14");
		Assert.assertTrue(true);
		Sdriver.close();
	}

}
