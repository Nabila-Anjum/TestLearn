package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.MacysWomenPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MacysWomen {
	WebDriver driver;

	@Given("^User Visit Macys Homepage$")
	public void user_Visit_Macys_Homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.macys.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			System.out.println("Browser and URL are not Working");
		}
	    
	}

	@When("^User Click on Women dropdown option and able to see New Arrivals$")
	public void user_Click_on_Women_dropdown_option_and_able_to_see_New_Arrivals() throws Throwable {
	    try {
	    	Actions act=new Actions(driver);
	    	MacysWomenPOM obj=new MacysWomenPOM(driver);
	    	act.moveToElement(obj.Women()).build().perform();
	    	obj.NewArrivals().click();
	    	
	    }
	    catch(Exception e) {
	    	System.out.println("Exception error");
	    }
	}

	@Then("^User will be able to go New Arrivals Portfolio$")
	public void user_will_be_able_to_go_New_Arrivals_Portfolio() throws Throwable {
	   
	}
}
