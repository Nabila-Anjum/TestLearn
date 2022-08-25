package com.nexttechitc.Stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.DellContactUsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellContactUs {
WebDriver driver;

@Given("^user visits Dell homepage$")
public void user_visits_Dell_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.dell.com");
	
    Thread.sleep(3000);
}

@When("^user clicks on Contact Us$")
public void user_clicks_on_Contact_Us() throws Throwable {
	DellContactUsPOM contactus=new DellContactUsPOM(driver);
	contactus.contactus().click();
	
   
}

@Then("^user should be able to redirect to the Contact Us Page$")
public void user_should_be_able_to_redirect_to_the_Contact_Us_Page() throws Throwable {


}


}
