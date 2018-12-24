package com.grid;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class A {
	WebDriver driver;
	
	@Test
	
	public void aa() throws AWTException, InterruptedException 
	
	{
	driver=  new ChromeDriver();
	
	driver.manage().window().maximize();
	 


driver.get("https://stackoverflow.com/questions/15024756/selenium-webdriver-zoom-in-out-page-content");

Robot robot = new Robot();

for(int i=0;i<4;i++)
{
	robot.keyPress(KeyEvent.VK_CONTROL);

	
	 robot.keyPress(KeyEvent.VK_ADD);
	 
	 
	 robot.keyRelease(KeyEvent.VK_ADD);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	
}
	
Thread.sleep(7000);
for(int i=0;i<4;i++)

{
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 
	 robot.keyPress(KeyEvent.VK_SUBTRACT);
	 
	 
	 robot.keyRelease(KeyEvent.VK_SUBTRACT);

	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 
}
	}
}
