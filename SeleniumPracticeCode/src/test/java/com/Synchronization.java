package com;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Synchronization {
	
	
	WebDriver driver;
	
	
	@Test
	
	public void testSyn() throws InterruptedException
	{
		
	driver = new ChromeDriver();
	
	
	driver.get("https://www.practice-pad.com");
	
	driver.manage().window().maximize();
	
	
Synutlility.isElementisPresemt(driver, "//input[@id='username_or_email']", 20).sendKeys("kunal");
 
Synutlility.isElementisPresemt(driver, "//input[@id='login_password']", 10).sendKeys("password");
	
	Synutlility.isElementisPresemt(driver, "//input[@value='Login']", 10).click();
	
	Synutlility.isElementisPresemt(driver, "//*[@id='Layer_1']", 10).click();
	
	Thread.sleep(2000);
	
	WebElement selectPicker=  driver.findElement(By.xpath("//*[@class='selectpicker']"));
	
	
	Select select = new Select(selectPicker);
	
	
	
	
	if(select.isMultiple())
	{
	
		System.out.println("Select is Mutliple");
     select.selectByIndex(0);
     select.selectByIndex(1);
     select.selectByIndex(2);
     select.selectByIndex(3);
     select.selectByIndex(4);
	
     List<WebElement> osel = select.getOptions();
     
     
     for(int i =0;i<osel.size();i++)
     {
    	 
    	 String aa = osel.get(i).getText();
    	 System.out.println("All Select Box Options is " +"::" +aa);
         
       
         
     }
     List<WebElement> osel1 = select.getAllSelectedOptions();
         for(int i =0;i<osel1.size();i++)
         {
        	 
        	 String bb =  osel1.get(i).getText();
         System.out.println("All Selected Option is " +" :::"+bb); 
    	 
    	 
     }
     
     }
     
else
		
		
	{
		System.out.println("Selection is not Multiple");
		
		select.selectByIndex(22);
		
		
		
		
	}
		
	}
	
	
	}


