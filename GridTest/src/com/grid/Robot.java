package com.grid;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		driver = new ChromeDriver();
		
	/*	driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'smilechart.xls')]")).click();
		
		Thread.sleep(1000);
		
		
		java.awt.Robot robot = new java.awt.Robot();
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		System.out.println(driver.manage().window().getPosition().getX());
		
		System.out.println(	driver.manage().window().getPosition().getY());
		
		
		robot.mouseWheel(100); */
		
		
		
		driver.get("http://52.221.226.245/");
		
		java.awt.Robot robot = new java.awt.Robot();
		Thread.sleep(1000);
		
	WebElement ele=	driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
		
	Thread.sleep(2000);
	//Actions act = new Actions(driver);
	 //act.contextClick(ele).build().perform();
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		
		
		for(int i=0;i<4;i++)

			
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
		
		System.out.println("Done check ");
	}

}
