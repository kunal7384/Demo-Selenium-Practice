package com.grid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ZoominZooomOut {
	
	WebDriver driver;
	ATUTestRecorder record;
	
	
	@Test
	
	public void test() throws AWTException, ATUTestRecorderException
	{
		
		driver = new ChromeDriver();
		
		
		record = new ATUTestRecorder("F:\\Selenium November Code 2018\\GridTest\\TestRecord", "Google", false);
	  record.start();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Robot robot  =  new Robot();
		
		
		for(int i=0;i<4;i++)
		{
			
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		
		System.out.println(driver.manage().window().getSize());
		 for(int i=0;i<4;i++) 
		 {
			 
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 
			 robot.keyPress(KeyEvent.VK_SUBTRACT);
			 
			 robot.keyRelease(KeyEvent.VK_SUBTRACT);
			 
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 
			 
		 }
		 
		 Dimension d  = new Dimension(1200, 450);
		 
		 driver.manage().window().setSize(d);
		 
		 System.out.println(driver.manage().window().getSize());
		 
		
		 
		 
		 driver.get("http://52.221.226.245/");
		 
		 driver.manage().window().maximize();
		 
		 record.stop();
		 driver.close();
		 
	}
	 
	
}