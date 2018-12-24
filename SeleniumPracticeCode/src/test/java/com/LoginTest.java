package com;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.Login;
import com.pages.Login1;

public class LoginTest {
	WebDriver driver;
	
	Login login;
	Login1  login1;
	
	@Test
	
	
	public void verifyLogin()
	{
		driver = new ChromeDriver();
		
		driver.get("http://52.221.226.245");
		
		login = new Login(driver) ;
		
		login1 = new Login1();
		 login.clickOnLogin();
		Login.setUSernamr(driver).sendKeys("kd@narola.email");
		
		login1.setPAssword(driver).sendKeys("password");
		
		
		login1.setLogin(driver).click();
		
		
		
		
	}

}
