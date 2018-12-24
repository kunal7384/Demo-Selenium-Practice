package com;

import java.awt.Dimension;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;
	
	
	@Test
	
	public void windowHandle() throws InterruptedException, FindFailed
	{
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window" + parentWindow);
		
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		

		
		
		
	/*for(String child : driver.getWindowHandles())
		{
			if(!parentWindow.equals(child))
			{
				
				driver.switchTo().window(child);
				
				driver.findElement(By.xpath("//*[@alt='Selenium Tutorial in Java']")).click();		
				
			}
			System.out.println("2");
		}*/
		
		
		Set<String> handles = driver.getWindowHandles();
		
		
		System.out.println("Window Handles" + handles);
		
		Iterator<String> sethandle = handles.iterator();
		
		while(sethandle.hasNext())
		{
			
		String childWindow = sethandle.next();
		
		if(!parentWindow.equals(childWindow))
		{
			
			driver.switchTo().window(childWindow);
			
		driver.findElement(By.xpath("//*[@alt='Selenium Tutorial in Java']")).click();	
		System.out.println(driver.getTitle());	
			driver.close();
		}
			
		} 
		
		
		driver.switchTo().window(parentWindow);
		
		
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
	

		System.out.println(driver.getTitle());	
		
		Set<String> handles1 = driver.getWindowHandles();
		
		System.out.println("gjkfjgjdfjg"+handles1);
Iterator<String> sss = handles1.iterator();
		
		while(sss.hasNext())
		{
			
		String childWindow1 = sss.next();
		
		if(!parentWindow.equals(childWindow1))
		{
		
			System.out.println("11");
			driver.switchTo().window(childWindow1);
			System.out.println("111" +driver.getWindowHandle());
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@alt='Appium StudioTutorial']")).click();
		
     driver.findElement(By.xpath("//*[text()='Appium Studio : Getting Started']")).click();
     driver.findElement(By.xpath("//*[text()='Installation and SetUp']")).click();
     String a=driver.getTitle();	
     driver.close();
		}
		
		}
		
		driver.switchTo().window(parentWindow);
		
		
		
	//	driver.findElement(By.xpath("//*[text()='Alert Box']")).click();
	  

			org.sikuli.script.Screen s  = new org.sikuli.script.Screen();
			
			Pattern i =  new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\ssss.PNG");
		
		WebElement right=     driver.findElement(By.xpath("//a[contains(text(),'TestNg')]"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(right).build().perform();
		
		s.wait(i,5);
		s.click(i);
		
		
	//	Alert alert = driver.switchTo().alert();
		
	//	alert.accept();
		
		
		
	}

}
