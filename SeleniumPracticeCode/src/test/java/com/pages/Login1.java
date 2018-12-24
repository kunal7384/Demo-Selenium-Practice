package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {

WebDriver driver;


     public WebElement setPAssword(WebDriver driver)
     {
    	 
    	return driver.findElement(By.id("signin-password")) ;
    	 
    	 
     }
     
     
     
     public WebElement setLogin(WebDriver driver)
     {
    	 
    	 return driver.findElement(By.xpath("//input[@value='Login']"));
    	 
    	 
     }
}
