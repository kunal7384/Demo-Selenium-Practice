package com.bank.selenium.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginPage {
	
       WebDriver driver;
	
	
	@FindBy(name="uid")
	WebElement txt_UserName;
	
	@FindBy(name="password")
	WebElement txt_Password;
	
	
	@FindBy(name="btnLogin")
	WebElement btn_clickLogin;
	
	
	public InvalidLoginPage(WebDriver driver)
	{
		
       this.driver =driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void setUserName(String uname)
	{
		txt_UserName.clear();
		txt_UserName.sendKeys(uname);
		
	}
	
	
	public void setPassword(String upass)
	{
		txt_Password.clear();
		txt_Password.sendKeys(upass);
		
		
	}
	
	
	public void setClickLogin()
	{
		
		btn_clickLogin.click();
		
		
	}

}
