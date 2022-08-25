package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSigninPOM {
	WebDriver driver;
	
	public FacebookSigninPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//input[@type=\"text\"]")
	
	WebElement Type_Email;
	public WebElement Email() {
		return Type_Email;
		}
	

	@FindBy (xpath="//*[@id=\"pass\"]")
	
	WebElement Type_Password;
	public WebElement Password() {
		return Type_Password;
		}
	

	@FindBy (xpath="//*[@id=\"loginbutton\"]")
	
	WebElement Click_Login;
	public WebElement Login() {
		return Click_Login;
		}
	

}
