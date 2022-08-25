package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuySearchPOM {
	WebDriver driver;
	
	public BestBuySearchPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement Type_search;
	public WebElement search () {
		return Type_search;
		
	}
	
	@FindBy(css="#shop-header-44521598 > div > div.header-hamburger > header > div.top-fluid-container > div > div.shop-search-bar > div > form > button.header-search-button > span > svg")
	WebElement Click_searchicon;
	public WebElement searchicon () {
		return Click_searchicon;
		
	}
	

}
