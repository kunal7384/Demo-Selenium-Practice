package com.grid;


import java.net.MalformedURLException;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
public static  WebDriver driver;
	
	@BeforeClass
 @Parameters("browser")
	
	public void demoTest(String browser) throws MalformedURLException  {
		 
	
		if(browser.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://192.168.100.17:4444/wd/hub");
		
		 driver=new RemoteWebDriver(url, cap);
		} 
		 
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Driver/geckodriver.exe"); 
				DesiredCapabilities cap = DesiredCapabilities.firefox();
				
			   cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				
				URL url = new URL("http://192.168.100.17:5556/wd/hub");
				
				 driver=new RemoteWebDriver(url, cap);
			 
			 
		 }
		
		driver.get("https://www.google.com/");
		
		
	}

	      @Test()
	      public void search_google()
	      {
	    	
	    driver.findElement(By.name("q")).sendKeys("Selenium");	  
	    	  
	    	  
	      
	      }
	
}
