package com.nexttechitc.Stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSignin {
	WebDriver driver;

	@Given("^user visits Google home page$")
	public void user_visits_Google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		}

	@When("^user type name$")
	public void user_type_name() throws Throwable {
	   
	}

	@Then("^user will be able to login$")
	public void user_will_be_able_to_login() throws Throwable {
	    
	}


	
	
	
}
