package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.InstagramSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstagramSignup {
WebDriver driver;

	@Given("^User visit Instagram homepage$")
	public void user_visit_Instagram_homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.instagram.com/accounts/emailsignup/");
			driver.manage().window().maximize();
			
		}
		catch(Exception e) {
			System.out.println("Browser and URL are not working");
		}

	}

	@When("^User type valid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_valid_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   try {
		   InstagramSignupPOM obj=new InstagramSignupPOM(driver);
		   obj.email().sendKeys(arg1);
		   obj.fullname().sendKeys(arg2);
		   obj.username().sendKeys(arg3);
		   obj.password().sendKeys(arg4);
	   }
	   catch(Exception e) {
		   System.out.println("Exception error");
	   }
	}

	@Then("^User will be able to Sign Up$")
	public void user_will_be_able_to_Sign_Up() throws Throwable {
		
		driver.quit();
		
	  }
}
