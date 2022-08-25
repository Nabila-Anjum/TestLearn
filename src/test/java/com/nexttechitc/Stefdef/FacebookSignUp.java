package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.FacebookSignUpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignUp {
WebDriver driver; 

	@Given("^user visit FB homepage$")
	public void user_visit_FB_homepage() throws Throwable {
	    try {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	
	    	driver.get("https://www.facebook.com/r.php");
	    	
	    	driver.manage().window().maximize();
	    	//Thread.sleep(2000);
	    }
	    catch(Exception e) {
	    	System.out.println("Browser and URL not opening");
	    }
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   try {
		   FacebookSignUpPOM obj=new FacebookSignUpPOM(driver);
		   obj.firstname().sendKeys(arg1);
		   obj.lastname().sendKeys(arg2);
		   obj.email().sendKeys(arg3);
		   obj.password().sendKeys(arg4);
		  
	   }
	   catch(Exception e) {
		   System.out.println("Exception error");
	   }
	}

	@When("^user select dropdown month and dropdown day and dropdown year$")
	public void user_select_dropdown_month_and_dropdown_day_and_dropdown_year() throws Throwable {
		   try {
			   FacebookSignUpPOM obj=new FacebookSignUpPOM(driver);
				Select dropdown=new Select (obj.click_month);
				dropdown.selectByIndex(3);
				Select dropdown1=new Select (obj.click_day);
				dropdown1.selectByIndex(23);
				Select dropdown2=new Select (obj.click_year);
				dropdown2.selectByVisibleText("1995");
				}
		   catch(Exception e) {
		   System.out.println("Exception error");
	   }

	}

	@When("^user click gender option$")
	public void user_click_gender_option() throws Throwable {
		try {
			   FacebookSignUpPOM obj=new FacebookSignUpPOM(driver);
			   obj.radiobutton_female().click();
		   }
	 
	   catch(Exception e) {
		   System.out.println("Exception error");
	   }

	}

	@When("^user click Sign UP option$")
	public void user_click_Sign_UP_option() throws Throwable {
		try {
			   FacebookSignUpPOM obj=new FacebookSignUpPOM(driver);
			   obj.signUp().click();
		   }
	 
	   catch(Exception e) {
		   System.out.println("Exception error");
	   }

	}

	@Then("^user will be able to create an account seccefully$")
	public void user_will_be_able_to_create_an_account_seccefully() throws Throwable {
	   // driver.quit();
	}

}
