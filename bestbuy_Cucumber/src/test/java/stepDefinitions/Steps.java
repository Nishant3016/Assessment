package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
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


@And("User select search Menu and Enter item as {string} and click on search")
public void user_select_search_Menu_and_Enter_item_as_and_click_on_search(String item) {
	Ip.SearchiPhone(item);
}

@And("select filter in condition for pre-owned")
public void click_on_select_filter() {
	Ip.SelectFilter();;
    
}

@And("Find an item with a description, model and price")
public void find_an_item_with_a_description_model_and_price() {
	Ip.SelectItem();
}


@Then("Click on Add to Cart and Verify that a popup")
public void click_on_Add_to_Cart() throws InterruptedException {
    Ip.ClickonAddToCartandVerify();
    
}


@When("click on cart page")
public void click_on_cart_page() {
	Ip.ClickonCart();
  
}

@Then("User should be found on Cart page")
public void user_should_be_found_on_Cart_page() {
	Ip.CartPage();
	
}

@Then("Verify that {string} is not present in the cart items")
public void verify_that_is_not_present_in_the_cart_items(String string) {
	  Ip.VerifyOtheritem();
}

}
