package com.bank.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositeDataDriven {
	
WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	WebElement btn_clickonDeposite;
	
	
	@FindBy(name="accountno")
	WebElement txt_setAccountNumber;
	
	
	@FindBy(name="ammount")
	WebElement txt_setAmmount;
	
	
	@FindBy(name="desc")
	WebElement txt_setDescription;
	
	
	@FindBy(name="res")
	WebElement btn_clickOnReset;
	
	
	
	@FindBy(name="AccSubmit")
	WebElement btn_clickOnSubmit;
	
	public DepositeDataDriven(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void clickonDeposite()
	{
		btn_clickonDeposite.click();
		
		
	}

	public void setAccountNumber(String accountid)
	{
		
		txt_setAccountNumber.sendKeys(accountid);
		
	}
	
	public void setAmount(String amount)
	{
		
		txt_setAmmount.sendKeys(amount);
		
	}
	
	
	public void setDescription()
	{
		txt_setDescription.sendKeys("Testing Purpose set");
		
	}
	
	public void clickonReset()
	{
		
		btn_clickOnReset.click();
	}
	
	public void clickonSubmit()
	{
		btn_clickOnSubmit.click();
		
		
	}
	
	
}
