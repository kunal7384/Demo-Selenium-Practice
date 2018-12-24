package com.bank.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")
	WebElement btn_newAccount;
	
	
	@FindBy(name="cusid")
	WebElement txt_customerid;
	
	
	@FindBy(name="selaccount")
	WebElement rao_select;
	
	
	@FindBy(name = "inideposit")
	WebElement txt_initialDeposite;
	
	@FindBy(name="button2")
	WebElement btn_submit;
	
	@FindBy(name="reset")
	WebElement btn_reset;
	
	
	
	
	public NewAccountPage (WebDriver driver)
	{
		
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public void clickonNewAccount()
	{
		
		btn_newAccount.click();
		
		
	}
	
	public void setcustomerId(String cid)
	{
		txt_initialDeposite.clear();
		txt_customerid.sendKeys(cid);
		
		
	}
	
	
	public void selectAccount()
	{
		
		
		rao_select.click();
	}
	
	public void enterIntialDeposite(String deposite)
	{
		
		txt_initialDeposite.sendKeys(deposite );
		
	}
	
	
	public void clickonSubmit()
	{
		
		btn_submit.click();
		
		
	}
	
	
	public void clickonReset()
	{
		
		btn_reset .click();
		
	}
}
