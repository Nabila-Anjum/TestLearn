package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FacebookSigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignin {
WebDriver driver;

	@Given("^User Visit Facebook Homepage$")
	public void user_Visit_Facebook_Homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/login.php");
			driver.manage().window().maximize();
			
		}
		catch(Exception e) {
			System.out.println("Browser and URL are not working");
		}

	}

	@When("^User Type Valid Email \"([^\"]*)\" and Password \"([^\"]*)\" and click Login option$")
	public void user_Type_Valid_Email_and_Password_and_click_Login_option(String arg1, String arg2) throws Throwable {
		try {
			FacebookSigninPOM obj=new FacebookSigninPOM(driver);
			obj.Email().sendKeys(arg1);
			WebDriverWait wait= new WebDriverWait(driver,20);
			Thread.sleep(2000);

			obj.Password().sendKeys(arg2);
			WebDriverWait wait1= new WebDriverWait(driver,20);
			Thread.sleep(2000);

			obj.Login().click();
			WebDriverWait wait2= new WebDriverWait(driver,20);
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Code Exception error");
		}

	}

	@Then("^User will be able to  sign in Succefully$")
	public void user_will_be_able_to_sign_in_Succefully() throws Throwable {
		driver.quit();

	}

}
