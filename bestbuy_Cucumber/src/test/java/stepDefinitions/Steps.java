package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.*;
import pageObjects.iPhonePage;


public class Steps {
	
	public WebDriver driver;
	public iPhonePage Ip;
	

@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\SE\\Selenium 2023\\Softwares\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("D:\\SE\\Selenium 2023\\Softwares\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(co);
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Ip= new iPhonePage(driver);
}

@When("User opens URL {string}")
public void user_opens_URL(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

@And("User select country as United State")
public void user_select_country_as_United_State() {
    Ip.SelectCountry();
}

@And("User select search Menu and Enter item as {string}")
public void user_select_search_Menu_enter_item_as(String item) {
   Ip.SearchiPhone(item);
}


@And("Click on search button")
public void click_on_search_button() {
	Ip.ClickonSearch();
    
}


@Then("Click on Add to Cart")
public void click_on() {
    Ip.ClickonAddToCart();
}

@Then("Verify that a popup appears with the text ")
public void verify_that_a_popup_appears_with_the_text() {
	String alertText = driver.switchTo().alert().getText();
	String expalertText = "Added to cart";
	Assert.assertEquals(alertText, expalertText);
	System.out.println("Alert text verified");
}

@When("click on cart page")
public void click_on_cart_page() {
	Ip.ClickonCart();
  
}

@Then("User should be found on Cart page")
public void user_should_be_found_on_Cart_page() {
	driver.getPageSource().contains("Order Summary");
		Assert.assertTrue(false);
}

@Then("Verify that iPhone14 is not present in the cart items")
public void verify_that_is_not_present_in_the_cart_items() {
   
}

}
