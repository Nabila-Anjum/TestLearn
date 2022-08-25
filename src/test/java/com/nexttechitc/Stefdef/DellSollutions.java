package com.nexttechitc.Stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellSollutionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSollutions {
	WebDriver driver;
	
	@Given("^User visit Dell Homepage$")
	public void user_visit_Dell_Homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://deals.dell.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			System.out.println("Browser and URL are not Opening");
		}
	}

	@When("^User go to Dell sollutions dropdown menu and able to see the Cloud solutions dropdowm menu and able to see View all cloud sollutions$")
	public void user_go_to_Dell_sollutions_dropdown_menu_and_able_to_see_the_Cloud_solutions_dropdowm_menu_and_able_to_see_View_all_cloud_sollutions() throws Throwable {
		try {
			Actions act=new Actions(driver);
			DellSollutionsPOM obj=new DellSollutionsPOM(driver);
			act.moveToElement(obj.Sollutions()).build().perform();
			act.moveToElement(obj.cloudsollutions()).build().perform();
			obj.ViewAllCloudSollutions().click();
			
			WebDriverWait Wait = new WebDriverWait (driver,20);

			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exception error");
		}

	}

	@Then("^User can see the potfolio page$")
	public void user_can_see_the_potfolio_page() throws Throwable {
		driver.quit();


	}

}
