package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	
	public static WebDriver driver ;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
		
	if(browser.equalsIgnoreCase("chrome"))
	{
		
		driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
		
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
		
		
	
		
		
		
		driver.manage().window().maximize();
		
		
	}
 	
	
	
	
	}
	
	
	
	
	   @AfterClass
	
     public void closeBrowser()
     {
		
		//driver.close();
		
		
     }
	   
	  
}
