package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellContactUsPOM {
WebDriver driver;
	
	   public DellContactUsPOM(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		 
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a/span/span")
	   WebElement click_contactus;
	   public WebElement contactus(){
	   return click_contactus;
	   }
}
