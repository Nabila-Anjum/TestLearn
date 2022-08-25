package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellAboutUsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAboutUs {
WebDriver driver; 

	@Given("^User visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://deals.dell.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Browser and URL is not oppening");
		}

	}

	@When("^user go to About us dropdown menu$")
	public void user_go_to_About_us_dropdown_menu() throws Throwable {
		
		Actions act=new Actions(driver);
		DellAboutUsPOM obj=new DellAboutUsPOM(driver);
		act.moveToElement(obj.AboutUs()).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@When("^able to Newsroom dropdown menu$")
	public void able_to_Newsroom_dropdown_menu() throws Throwable {
		
		Actions act=new Actions(driver);
		DellAboutUsPOM obj=new DellAboutUsPOM(driver);
		act.moveToElement(obj.Newsroom()).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,20);

	}

	@When("^able to blog$")
	public void able_to_blog() throws Throwable {
		Actions act=new Actions(driver);
		DellAboutUsPOM obj=new DellAboutUsPOM(driver);
		obj.Blog().click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);

	}

	@Then("^user able to see the expected portfolio$")
	public void user_able_to_see_the_expected_portfolio() throws Throwable {
		driver.quit();

	}

}	