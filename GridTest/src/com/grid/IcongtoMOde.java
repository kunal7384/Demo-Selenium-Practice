package com.grid;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IcongtoMOde {
	
	WebDriver driver;
	@Test(invocationCount=2)
	
	public void testMode() throws InterruptedException
	{
		
driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

driver.manage().window().maximize();


driver.get("http://toolsqa.com/automation-practice-form/");

Select select  = new Select(driver.findElement(By.id("selenium_commands")));

    java.util.List<WebElement> select1 = select.getOptions();
    
   int a= select1.size();
   
   for(int i=0;i<a;i++)
   {
	 String s = select1.get(i)  .getText();
	 
	 System.out.println(s);
	   
	  select.selectByIndex(i);
   }

	}

}
