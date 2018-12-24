package com.bank.selenium.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.selenium.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	LoginPage loginpage;
	
	String excepted ="Guru99 Bank Manager HomePage";

	
	 
	@Test(priority=1 ,description="Valid Login")
	
	public void testLogin() throws IOException
	{
	


	
	loginpage = new LoginPage(driver);
	
	
	loginpage.setUserName(UserName);
	
	loginpage.setPassword(password);
	
	loginpage.setClickLogin();
	
	String actual = driver.getTitle();
	 System.out.println(actual);
	
	if(excepted.equals(actual))
	{
		Assert.assertTrue(true);
		
		loginpage.clickLogOut();
	}
	
	else
	{
		
 
    Assert.assertTrue(false);
		
	}
	
	
	
	
		
		
	}

}
