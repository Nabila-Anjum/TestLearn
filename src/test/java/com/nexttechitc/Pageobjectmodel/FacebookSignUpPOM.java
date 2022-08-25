package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpPOM {
WebDriver driver;
	public FacebookSignUpPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement edit_firstname;
	public WebElement firstname() {
		return edit_firstname;		
	}
	
	
	@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement lastname() {
		return edit_lastname;		
	}
	
	@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement email() {
		return edit_email;		
	}
	
	
	@FindBy(id="password_step_input")
	WebElement edit_password;
	public WebElement password() {
		return edit_password;		
	}
	
	@FindBy(xpath="//*[@id=\"month\"]")
	public WebElement click_month;
	
	
	
	@FindBy(xpath="//*[@id=\"day\"]")
	public WebElement click_day;
	
	@FindBy(xpath="//*[@id=\"year\"]")
	public WebElement click_year;
	
	
	@FindBy(xpath="//input[@value=\"1\"]")
	WebElement click_radiobutton_female;
	public WebElement radiobutton_female() {
		return click_radiobutton_female;
			
	}
	
	@FindBy(id="u_0_s_nG")
	WebElement click_signUp_button;
	public WebElement signUp() {
		return click_signUp_button;
		
			
	}
	
	
	
	
	
	
}
