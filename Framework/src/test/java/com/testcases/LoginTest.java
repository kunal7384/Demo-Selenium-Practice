package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.LoginPage;

public class LoginTest extends BaseClass {
	
	
	LoginPage login ;
	String exceptedTitle ="GTPL Bank Manager HomePage";
	
	
	@Test(priority=1)
	
	public void validLogin() throws IOException
	{
   
     login = new LoginPage(driver);
     
     login.enterUsername(UserName);
     login.enterPassword(passWord);
     login.clickLogin();
     
    String actual_title= driver.getTitle();
    System.out.println(actual_title);
    
    if(actual_title.equals(exceptedTitle))
    {
    	
    Assert.assertTrue(true);
    	
    }
    else
    	
    {
    	
   
    
    Assert.assertTrue(false);
    }
	}

}
