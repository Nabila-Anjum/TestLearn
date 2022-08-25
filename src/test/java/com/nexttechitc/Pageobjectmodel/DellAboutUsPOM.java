package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAboutUsPOM {
	WebDriver driver; 
	
	public DellAboutUsPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/button/span")
	WebElement click_AboutUs;
	public WebElement AboutUs() {
		return click_AboutUs;
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/ul/li[5]/button")
	WebElement click_Newsroom;
	public WebElement Newsroom() {
		return click_Newsroom;
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/ul/li[5]/ul/li[6]/a")
	WebElement click_Blog;
	public WebElement Blog() {
		return click_Blog;
		
	}
	
	
	
	
	

}
