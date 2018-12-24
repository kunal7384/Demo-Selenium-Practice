package com.grid;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantonJs {
	
	
	
	public static void main(String[] args) {
		
	
		
		
			File file = new File("F:\\software\\phanton js\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
				
				

				  System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
                WebDriver driver = new PhantomJSDriver();	
		
		
	//	WebDriver  driver = new HtmlUnitDriver();
                  driver.get("http://www.google.com");         
                  WebElement element = driver.findElement(By.name("q"));	
                  element.sendKeys("Guru99");					
                  element.submit();         			
                  System.out.println("Page title is: " + driver.getTitle());	
				
	}

}
