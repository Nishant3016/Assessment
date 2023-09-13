package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
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
	
		@FindBy(xpath = "//input[@type='checkbox'][@id='condition_facet-Pre-Owned-1']")
		@CacheLookup
		WebElement itemLink;
	
	
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	@CacheLookup
	WebElement btnAddtocart;
	
	@FindBy(xpath = "//a[@title='Cart']//*[name()='svg']")
	@CacheLookup
	WebElement btnCart;
	
	@FindBy(xpath = "//span[text()= 'Log out']")
	@CacheLookup
	WebElement linkLogout;
	
	public void SelectCountry() {
		imgCountry.click();
	}
	
	public void SearchiPhone(String item) {
		txtSearch.clear();
		txtSearch.sendKeys(item);
		iconSearch.click();
	}
	public void ClickonSearch() {
		iconSearch.click();
	}
	
	
	public void SelectItem() {
		waithelper.WaitForElement(itemLink, 30);
		itemLink.click();
	}
	
	public void ClickonAddToCart() {
		waithelper.WaitForElement(btnAddtocart, 30);
		btnAddtocart.click();
	}
	
	public void ClickonCart() {
		waithelper.WaitForElement(btnCart, 30);
		btnCart.click();
	}
	

}
