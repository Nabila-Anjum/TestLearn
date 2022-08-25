package com.nexttechitc.Stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.BestBuySearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuySearch {
	WebDriver driver;

	@Given("^User visit BestBuy Homepage$")
	public void user_visit_BestBuy_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
	    driver.get("http://www.bestbuy.com");
	    driver.manage().window().maximize();
	}

	@When("^User Type \"([^\"]*)\" product name and click search icon$")
	public void user_Type_product_name_and_click_search_icon(String arg1) throws Throwable {
		BestBuySearchPOM obj=new BestBuySearchPOM(driver);
		obj.search().sendKeys(arg1);
		obj.searchicon().click();
		
	}

	@Then("^User should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
	    
	}
}
