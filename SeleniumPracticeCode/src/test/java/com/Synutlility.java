package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Synutlility {
	
	
	
	public static WebElement isElementisPresemt(WebDriver driver ,String xpath ,int time)
	{
		
		WebElement ele = null;
	
	for(int i =0;i<time;i++)
	{
		
		try
		{
 ele = driver.findElement(By.xpath(xpath));	
	
	break;
		}	
		catch (Exception e) {
			// TODO: handle exception
		}
		
		try
		
		{
			
		Thread.sleep(10000);	
			
		}
		
		catch (InterruptedException e1) {
			
			System.out.println("Waiting for element to appear on DOM");
			// TODO: handle exception
		}
		
	}
	return ele;
		
		
	}

}
