package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDataDrivenPage {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txt_usernameddt;
	
	
	@FindBy(name="password")
	WebElement txt_passwordddt;
	
	
	@FindBy(name="btnLogin")
	WebElement btn_logddt;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement btn_logout;
	
	
	
	public LoginDataDrivenPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void getUserNameDdt(String uddtname)
	{
		
	txt_usernameddt.sendKeys(uddtname);	
	
		
	}
	
	public void getpasswordDdt(String uddpass)
	{
		
	txt_passwordddt.sendKeys(uddpass);	
	
		
	}
	
	public void ddtLogin()
	{
		
btn_logddt.click();	
	
		
	}

	
	public void logOut()
	{
		
	btn_logout.click();	
		
	}
}
