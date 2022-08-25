package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSollutionsPOM {
	WebDriver driver;
	
	public DellSollutionsPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span")
	WebElement click_Sollutions;
	public WebElement Sollutions() {
		return click_Sollutions;
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/button")
	WebElement click_cloudsollutions;
	public WebElement cloudsollutions() {
		return click_cloudsollutions;
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a")
	WebElement click_ViewAllCloudSollutions;
	public WebElement ViewAllCloudSollutions() {
		return click_ViewAllCloudSollutions;
		
	}

}
