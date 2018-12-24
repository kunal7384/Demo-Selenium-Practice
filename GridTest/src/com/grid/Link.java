package com.grid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Link {
	
	WebDriver driver;
	
	
	@Test
	public void verifyLinkBreak() throws InterruptedException
	
	
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		
		
		
		Thread.sleep(2000);
		Actions act  =new Actions(driver);
		
		Thread.sleep(2000);
	act.contextClick(ele).build().perform();
	
	}
	
	

}
