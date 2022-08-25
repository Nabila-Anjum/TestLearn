package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCPenneyWomenPOM {

	WebDriver driver; 

	public JCPenneyWomenPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	 

	 
	   @FindBy(xpath="//div[ @data-automation-id=\"menu-item-link-3\"]")
	   WebElement click_Women;
	   public WebElement Women(){
	   return click_Women;
	   }
}
