package com.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	
	// Here We use
	WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='signup-btn signin']")
	
    WebElement btn_login;
	
	

	
	
	public Login(WebDriver driver)
	{
		
	this.driver= driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
	
	public static WebElement setUSernamr(WebDriver driver)
	{
		return driver.findElement(By.id("signin-email"));
		
		
		
	}
	
	
	public void clickOnLogin()
	{
		
		btn_login.click();
		
		 
	}
	
}
