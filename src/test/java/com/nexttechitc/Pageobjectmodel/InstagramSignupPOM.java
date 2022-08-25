package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramSignupPOM {
WebDriver driver;

	public InstagramSignupPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[3]/div/label/input")
	WebElement type_email;
	public WebElement email() {
		return type_email;
		
	}
	
	@FindBy(xpath="//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[4]/div/label/input")
	WebElement type_fullname;
	public WebElement fullname() {
		return type_fullname;
		
	}
	@FindBy(xpath="//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[5]/div/label/input")
	WebElement type_username;
	public WebElement username() {
		return type_username;
		
	}
	@FindBy(xpath="//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[6]/div/label/input")
	WebElement type_password;
	public WebElement password() {
		return type_password;
		
	}
	
	
	
	
	
}
