package com.bank.selenium.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.selenium.pages.InvalidLoginPage;

public class InvalidLoginTest extends BaseClass {
	
	
	InvalidLoginPage invalidloginpage;
	
	
	//Try to login Without Entering Username and Password 
	@Test(priority=2 ,description="InValid Login without Emtering UserName and Password")
	
	public void balnkLogin()
	{
	invalidloginpage = new InvalidLoginPage(driver);
		
//	invalidloginpage.setUserName(UserName);
	//invalidloginpage.setPassword(password);
	
	invalidloginpage.setClickLogin();
	
	  if(isAlertPresent()==true)
	  {
		  
		Alert alert = driver.switchTo().alert();
		
	String alerttext=	alert.getText();
	 System.out.println("Alert Text is ::" +"   " +alerttext);
	 
		alert.accept();		
		
		Assert.assertEquals(alerttext, "User or Password is not valid");
		  
	  }	  
		  
	  else
	  {
		  
		 System.out.println("Not Present Alert"); 
		  
	  }
	}
	
	// Enter UserName and keep password field Blank 
	
@Test(priority=3 ,description="Enter UserName and click on login")

	public void enterUsername()
	{
	invalidloginpage.setUserName(UserName);

	invalidloginpage.setClickLogin();
	
	if(isAlertPresent()==true) {
		
		Alert alert1 = driver.switchTo().alert();
		
	String alertText1=	alert1.getText();
	System.out.println("Alert Text1 is ::"+alertText1);	
	alert1.accept();
	
	Assert.assertEquals(alertText1, "User or Password is not valid");
	
	}
	else
	{
		System.out.println("Alert is not Present No need to handle it ");
		
	}
	
	}
	
	// Enter Password and keep UserName field Blank 
	
	@Test(priority=4 ,description="Enter Password and click on login")

		public void enterPassword()
		{
	
        invalidloginpage.setPassword(password);
		invalidloginpage.setClickLogin();
		
		if(isAlertPresent()==true) {
			
			Alert alert2 = driver.switchTo().alert();
			
		String alertText2=	alert2.getText();
		System.out.println("Alert Text2 is ::"+alertText2);	
		alert2.accept();
		
		Assert.assertEquals(alertText2, "User or Password is not valid");
		
		}
		else
		{
			System.out.println("Alert is not Present No need to handle it ");
			
		}
		
		
	
	
	
	}
	public  boolean isAlertPresent()
	{
		try
		{
	 driver.switchTo().alert();
	 
	 
		return true;
		}
		
catch (NoAlertPresentException e) {
	  
	
	return false;

	}

}
}

