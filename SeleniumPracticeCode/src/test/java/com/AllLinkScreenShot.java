package com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinkScreenShot {
	
	WebDriver driver;
	 final static Logger logger = LogManager.getLogger(AllLinkScreenShot.class);
	
	@Test
	
	
	public void checkAllLink() throws IOException
	{
		
/*  driver= new ChromeDriver();
  
  
  driver.manage().window().maximize();
  
  
  
  driver.get("http://newtours.demoaut.com/");
  
  
  
   List<WebElement> allLink = driver.findElements(By.tagName("a"));
   
   
   
	int link = allLink.size();
	
	System.out.println(link);
	
	for(int i = 0;i<allLink.size();i++)
	{
		
		String name = allLink.get(i).getText();
		
	       allLink.get(i).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target  = new File("C:\\Users\\dkunal\\Desktop\\screen\\" + name +".PNG");
		
		FileUtils.copyFile(source, target);
		
		driver.navigate().back();
		
		allLink = driver.findElements(By.tagName("a"));
		
		
	}*/
		
		 logger.fatal("Fatal message");
         logger.error("Dump error");
         logger.warn("Warning baby");
         logger.info("Hello - This is info");
         //Below messages will not be logged as we have set the log level as INFO
         logger.debug("Debug message");
         logger.trace("Trace message");
		driver =  new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int link = allLink.size();
		String[] l = new String[link];
		
		for(int i=0;i<allLink.size();i++)
		{
			
		l[i] = allLink.get(i).getAttribute("href");
			
			
		}
			
			for(int i=0;i<allLink.size();i++)
			{
				
				driver.navigate().to(l[i]);
				
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File target =  new File("C:\\Users\\dkunal\\Desktop\\screen\\" + i +".PNG");
				  FileUtils.copyFile(source, target);
			}
		
		
	}

}
