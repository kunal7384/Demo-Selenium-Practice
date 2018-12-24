package com;

import java.net.StandardSocketOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
	
	
	WebDriver driver;
	
	final String url = "http://www.helpingtesters.com/practice/selenium-basics/index.php";
	
	@Test
	
	public void testing() throws InterruptedException
	{
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get(url);
		
		
	WebElement tab = driver.findElement(By.xpath("//a[contains(text(),'Tabs')]"));
	
	tab.click();
 
	
	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='iframe/window/simple.html']")));
	  
	  
	 
	  
	 
	  driver.findElement(By.id("ui-id-5")).click();
	  Thread.sleep(2000);
	 boolean section1 = driver.findElement(By.xpath("//*[@id='ui-id-1' or@id='ui-id-2']//p")).isDisplayed(); 
	  boolean section2 = driver.findElement(By.xpath("//*[@id='ui-id-3' or@id='ui-id-4']//p")).isDisplayed();
	  
	
	  
	  
	  boolean section3 = driver.findElement(By.xpath("//*[@id='ui-id-5' or@id='ui-id-6']//p")).isDisplayed();
	  
	  boolean section4= driver.findElement(By.xpath("//*[@id='ui-id-7' or@id='ui-id-8']//p")).isDisplayed();
	
	  System.out.println(section1);
	  System.out.println(section2);
	  System.out.println(section3);
	  System.out.println(section4);
	  
	  
	  if(section1==true) 
	  {
		  
		  String sectin1Text =  driver.findElement(By.xpath("//*[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content ui-accordion-content-active']")).getText();
		  
		  
		  System.out.println("1"+sectin1Text);
		  
	  }
	  
	  else if(section2==true)
	  {
		  
		  
	String section2text =  driver.findElement(By.xpath("//*[@id='ui-id-3' or@id='ui-id-4']//p")).getText();
		  
	  System.out.println("2"+section2text);
		  
	  }
	  
	  else if(section3==true)
	  {
		  
		  
		  
		String section3Text =  driver.findElement(By.xpath("//*[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content ui-accordion-content-active']"))  .getText();
		
		System.out.println("3"+section3Text);
		
			
		  
	  }
	   
	  else if(section4==true)
	  {
		  
		  
	String section4Text = driver.findElement(By.xpath("//*[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content ui-accordion-content-active']"))	.getText();
	
	
	System.out.println("4" + section4Text);
		  
	  }
	  
	  driver.navigate().back();
	  
	 
	}
	 @Test(priority=2)
	  
	  public void handdlewindow() throws InterruptedException
	  
	  
	  {
		 driver.findElement(By.xpath("//*[text()='New Window / iFrame']")).click();
		Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='iframe/new-window/open-new-tab.html']")));
		 
		 driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		 
		String parent= driver.getWindowHandle();
		
		Set<String>  s = driver.getWindowHandles();
		
		
		Iterator<String> ss = s.iterator();
		
		while(ss.hasNext())
		{
			
			String child = ss.next();
			
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
				
			}
			
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//img[@src='http://www.helpingtesters.com/practice/assests/images/logo.png']")).click();
		
		
		
		 
		 
	  }
}
