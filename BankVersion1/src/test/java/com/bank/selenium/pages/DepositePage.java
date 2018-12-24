package com.bank.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepositePage {
	
	
	WebDriver driver;
	
	
	
	public WebElement clickonDeposite(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Deposit')]"));
		
		
		
	}

	public WebElement setAccountNumber(WebDriver driver)
	{
		
		return driver.findElement(By.name("accountno"));
		
	}
	
	public WebElement setAmount(WebDriver driver)
	{
		return driver.findElement(By.name("ammount"));
		
		
		
	}
	
	
	public WebElement setDescription(WebDriver driver)
	{
		
		return driver.findElement(By.name("desc"));
		
	}
	
	public WebElement clickonReset(WebDriver driver)
	{
		
		return driver.findElement(By.name("res"));
		
	}
	
	public WebElement clickonSubmit(WebDriver driver)
	{
		
		return driver.findElement(By.name("AccSubmit"));
		
	}
}
