package com.bank.selenium.testcases;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.selenium.pages.LoginPage;
import com.bank.selenium.pages.NewAccountPage;


public class NewAccountTest extends BaseClass {
	
	
	
	
	
	NewAccountPage newaccountpage;
	LoginPage loginpage;
	
	
	
	@Test(priority =1 ,description="Testing Reset FUnctionality" )
	
	public void resetTest() throws InterruptedException
	{
		
		
	loginpage = new LoginPage(driver);
	
	loginpage.setUserName(UserName);
	loginpage.setPassword(password);
	loginpage.setClickLogin();
	Thread.sleep(1000);

	newaccountpage= new NewAccountPage(driver)	;
	
	newaccountpage.clickonNewAccount();
	newaccountpage.setcustomerId("11111");
	newaccountpage.selectAccount();
	newaccountpage.enterIntialDeposite("500");
		
	newaccountpage.clickonReset();
	
	Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/V4/manager/addAccount.php");
		
	}
	
	@Test(priority=2,description="Without Enterig data try to click on Submmit button")
	
	public void withoutEnteringData() throws InterruptedException
	{
		Thread.sleep(4000);
	newaccountpage.clickonSubmit();
	
	if(isAlertisPresent()==true)
	{
		driver.switchTo().alert();
		
		Alert alert = driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Captured Alert Text is::"+alertText);
		alert.accept();
		Assert.assertEquals(alertText, "Customer does not exist!!");
		
	}
		
		
	}

	@Test(priority=3,description="Enter customer id and keep all other field blank and click on submit")
	
	public void enterCustomerId()
	{
		
	newaccountpage.setcustomerId("37060");
	newaccountpage.clickonSubmit();
	
	if(isAlertisPresent()==true)
	{
		
	Alert alert1 = driver.switchTo().alert();
	
	String alert1text = alert1.getText();
	System.out.println("Alert 1 Text is::"+alert1text);
	
	alert1.accept();
	
	Assert.assertEquals(alert1text, "Please fill all fields");
	
newaccountpage.clickonReset();
		
	}
		
	}
	
	@Test(priority=4,description="Create Account By Entering valid Data")
	
	public void createValidAccount() throws InterruptedException
	{
		
		
		newaccountpage.setcustomerId("37060");
		newaccountpage.selectAccount();
		
		int a =100;
		
		newaccountpage.enterIntialDeposite(""+a);
		newaccountpage.clickonSubmit();
		
		
		if(a<500)
		{
			
			if(isAlertisPresent()==true)
			{
			Alert allert = driver.switchTo().alert();
			
			String aText = allert.getText();
			
			System.out.println("We Enter less Than 500 ruppes "+aText);
			allert.accept();
			Assert.assertEquals(aText, "Intial deposite must be Rs. 500 or more");
				
			}	
		}	
			else 
			{
				if(isAlertisPresent()==false)
				{
					
					System.out.println("SucessFully "+driver.getCurrentUrl());
					String accDetail= driver.findElement(By.id("Accmsg")).getText();
					System.out.println(accDetail);
					
				String title=	driver.findElement(By.xpath("//*[text()='Account Generated Successfully!!!']")).getText();
					Assert.assertEquals(title, "Account Generated Successfully!!!");
					
		
				}
				
				else
				{
				Alert aaaa = driver.switchTo().alert();
				
				String aaText = aaaa.getText();
				aaaa.accept();
				System.out.println("We Enter Wrong Customer Id"+aaText);
				Assert.assertEquals(aaText, "Customer does not exist!!");
				
			}
				
			
			}
		
		
		
		
		
		
		
	}
	public boolean isAlertisPresent()
	{
		
		try
		{
			driver.switchTo().alert();
			return true;
		}
		
		catch (NoAlertPresentException e) {
			return false;
			// TODO: handle exception
		}
	}
	
	
	
}
