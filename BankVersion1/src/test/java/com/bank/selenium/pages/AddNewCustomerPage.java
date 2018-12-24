package com.bank.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement btn_click;
	
	
	@FindBy(name="name")
	WebElement txt_firstName;
	
	
	@FindBy(xpath="//input[@value='m']")
	WebElement txt_gender;
	

	@FindBy(id="dob")
	WebElement txt_dob;
	
	@FindBy(name="addr")
	WebElement txt_address;
	
	
	@FindBy(name="city")
	WebElement txt_city;
	
	
	@FindBy(name="state")
	WebElement txt_state;
	
	@FindBy(name="pinno")
	WebElement txt_pin;
	
	
	@FindBy(name="telephoneno")
	WebElement txt_mobile;
	
	@FindBy(name="emailid")
	WebElement txt_email;
	
	
	@FindBy(name="password")
	WebElement txt_password;
	
	
	@FindBy(name="sub")
	WebElement btn_submmit;
	
	@FindBy(name="res")
	WebElement btn_reset;
	
	@FindBy(id="//*[@id='message']")
	WebElement error_firstname;
	
	public AddNewCustomerPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonNewCustomer() 
	
	{
	btn_click.click();
		
	
	}
	
	
	public void setCustomerName(String fname)
	{

		txt_firstName.sendKeys(fname);
		
	}

	
	public void setGender()
	{
		
	txt_gender.click();
		
	}
	
	
	public void setDOB()
	{
		
		txt_dob.sendKeys("08021990");
		
	}
	
	
	
	public void setAddress(String add)
	{
		
	 txt_address.sendKeys(add);
		
		
	}
	
	public void setCity(String cityy)
	{
		
	txt_city.sendKeys(cityy);
		
	}
	
	public void setState(String state)
	{
		
	txt_state.sendKeys(state);
		
	}
	
	public void setPin(String pinno)
	{
		
		txt_pin.sendKeys(pinno);
		
	}
	
	public void setMobile(String number)
	{
		
		txt_mobile.sendKeys(number);
		
	}
	
	public void setEmailid(String email)
	{
		
	txt_email.sendKeys(email);
		
	}
	
	
	public void setPassword(String pass)
	{
		
		txt_password.sendKeys(pass);
		
	}
	
	public void clickSubmit()
	{
		btn_submmit.click();
		
	}
	
	public void clickReset()
	{
		
		btn_reset.click();
		
	}
	
	public void validateFirstName()
	{
		
	String typeValue = txt_firstName.getAttribute("value");
	
	System.out.println(typeValue);
	 System.out.println(typeValue.length());
	 
	  if(txt_firstName.getAttribute("maxlength").equals("25"))
	  {
		  
		System.out.println("First Name having limition we can enter Character up to 25");  
		  
	  }
	  
	
	}
	
	
	  public void validatePin()
	  
	  {
		  txt_pin.clear(); 
		  txt_pin.sendKeys("aaaaaa");
		  
		  String typevalue = txt_pin.getAttribute("value");
		  
		  System.out.println(typevalue );
		  
		  
		  System.out.println(typevalue.length());
		  
		  if(driver.findElement(By.xpath("//*[text()='Characters are not allowed']")).getText().equals("Characters are not allowed"))
		  {
			  
			System.out.println("Only Number Allowed so enter Number") ;
			  
		  }
		  
		  else
		  {
			  
			  
			  System.out.println("Valid Pin");
		  }
		  
		  txt_pin.clear(); 
		  txt_pin.sendKeys("1234");
	
		  

		  String typevalue1 = txt_pin.getAttribute("value");
		  
		  System.out.println(typevalue1 );
		  
		  
		  System.out.println(typevalue1.length());
		  
		  if(driver.findElement(By.xpath("	//*[text()='PIN Code must have 6 Digits']")).getText().equals("PIN Code must have 6 Digits"))
		  {
			  
			System.out.println("Enter 6 character pinr") ;
			  
		  }
		  
		  else
		  {
			  
			  
			  System.out.println("Valid Pin");
		  }
		  
	  }
	
	
}
