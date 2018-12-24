package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txt_username;
	
	
	@FindBy(name="password")
	WebElement txt_password;
	
	
	@FindBy(name="btnLogin")
	WebElement btn_log;
	
	public LoginPage(WebDriver driver)
	{
		
	this.driver= driver;
	PageFactory.initElements(driver, this);
		
		
	}
	
	public void enterUsername(String unmae)
	{
		
		txt_username.sendKeys(unmae);
		
	}

	
	public void enterPassword(String pass)
	{
		
		txt_password.sendKeys(pass);
		
	}
	
	public void clickLogin()
	{
		
		
		btn_log.click();
	}
}
