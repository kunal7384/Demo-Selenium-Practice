package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
        WebDriver driver;
        
        @FindBy(name="q")
        WebElement searchText;
        
        
        
        public HomePage(WebDriver driver)
        {
        	this .driver = driver;
        	
        	PageFactory.initElements(driver, this);                                
        	
        	
        }

        public void setSearch(String enterSearch)
        {
        	
        	searchText.sendKeys(enterSearch);
        	
        	searchText.sendKeys(Keys.ENTER);
        	
        	
        }
        
}




