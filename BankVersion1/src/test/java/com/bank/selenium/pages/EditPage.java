package com.bank.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
	WebDriver driver;
	
	@FindBy(xpath=" //a[contains(text(),'Edit Customer')]")
	WebElement btn_edit;
	
	@FindBy(name= "cusid")
	WebElement txt_customerid;
	
	@FindBy(name="AccSubmit")
	WebElement btn_submit;
	
	
	
	@FindBy(name="res")
	WebElement btn_reset;
	
	
	public EditPage(WebDriver driver)
	{
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
		
	}

	public void clickonEditCustomer() {
		
		btn_edit.click();
		
		
	}
	
	public void setCustomerId(String id)
	{
		
		
		txt_customerid.sendKeys(id);
		
		
	}
	
	
	
	public void clickSubmit()
	{
		
		btn_submit.click();
		
		
	}
	
	
	public void clickonReset()
	{
		
		btn_reset.click();
		
	}
}
