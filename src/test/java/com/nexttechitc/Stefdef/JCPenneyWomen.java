package com.nexttechitc.Stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.JCPenneyWomenPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JCPenneyWomen {
	WebDriver driver; 

	@Given("^User visit JCPenney Homepage$")
	public void user_visit_JCPenney_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://JCPenny.com");
	}

	@When("^User click on Women option$")
	public void user_click_on_Women_option() throws Throwable {
		JCPenneyWomenPOM Women=new JCPenneyWomenPOM(driver);
		Women.Women().click();


	}

	@Then("^User should be redirect to Women page$")
	public void user_should_be_redirect_to_Women_page() throws Throwable {
	    
	}

}
