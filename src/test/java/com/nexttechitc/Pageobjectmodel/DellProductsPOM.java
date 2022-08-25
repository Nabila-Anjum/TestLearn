package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellProductsPOM {
	WebDriver driver;
	 public DellProductsPOM (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span") 
	   WebElement click_Products;
	   public WebElement Products(){
		return click_Products;
	 
	    }
	 
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/button") 
	   WebElement click_Laptops;
	   public WebElement Laptops(){
		return click_Laptops;
		
	    }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/ul/li[3]/a") 
	   WebElement click_viewAllLaptops;
	   public WebElement viewAllLaptops(){
		return click_viewAllLaptops;
		
	    }

}
