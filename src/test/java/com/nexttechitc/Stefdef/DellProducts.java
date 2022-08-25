package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellProductsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellProducts {
WebDriver driver;

	@Given("^User Visit Dell Homepage$")
	public void user_Visit_Dell_Homepage() throws Throwable {
     try {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 
    	 driver.get("https://deals.dell.com/");
    	 driver.manage().window().maximize();
     }
     catch (Exception e) {
    	 System.out.println("Browser and url error");
     }

	}

	@When("^User go to Products dropdown manue and able to see laptop dropdown manue and able to see view all laptops$")
	public void user_go_to_Products_dropdown_manue_and_able_to_see_laptop_dropdown_manue_and_able_to_see_view_all_laptops() throws Throwable {
		try {
			
			Actions act= new Actions(driver);
			DellProductsPOM obj=new DellProductsPOM(driver);
			act.moveToElement(obj.Products()).build().perform();
			act.moveToElement(obj.Laptops()).build().perform();
			Thread.sleep(2000);
			obj.viewAllLaptops().click();
			Thread.sleep(2000);

		}
		catch(Exception e) {
			System.out.println("Exception error");
		}

	}

	@Then("^user should be able to go all laptops portfolio$")
	public void user_should_be_able_to_go_all_laptops_portfolio() throws Throwable {
		
		driver.quit();
	}

}
