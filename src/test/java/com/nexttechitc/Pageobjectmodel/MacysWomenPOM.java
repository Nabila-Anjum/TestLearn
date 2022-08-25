package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacysWomenPOM {
	WebDriver driver;
	
	public MacysWomenPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(xpath="//*[@id=\"flexid_118\"]/a/span")
	   WebElement click_Women;
	   public WebElement Women(){
	   return click_Women;
	   }
	
	   @FindBy(xpath="//*[@id=\"mainNavigationFlyouts\"]/div[1]/div[1]/div/a[2]")
	   WebElement click_NewArrivals;
	   public WebElement NewArrivals() {
		return click_NewArrivals;
		   
	   }
	
	
	
	
	

}
