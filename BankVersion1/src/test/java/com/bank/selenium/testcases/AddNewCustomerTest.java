package com.bank.selenium.testcases;

import java.io.IOException;

import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.selenium.pages.AddNewCustomerPage;
import com.bank.selenium.pages.LoginPage;

public class AddNewCustomerTest extends BaseClass {
	
	String actualUrl ="http://demo.guru99.com/V4/manager/addcustomerpage.php";
	AddNewCustomerPage addnewcustomerpage;
	LoginPage loginpage;
	
	@Test(priority=1,description="Create valid Customer")
	
	public void addNewCustomer() throws IOException, InterruptedException
	{
    loginpage = new LoginPage(driver);
	loginpage.setUserName(UserName);
	loginpage.setPassword(password);
	loginpage.setClickLogin();
	Thread.sleep(1000);
	addnewcustomerpage = new AddNewCustomerPage(driver);
	
	addnewcustomerpage.clickonNewCustomer();
	addnewcustomerpage.setCustomerName("Kunal");
	addnewcustomerpage.setGender();
	addnewcustomerpage.setDOB();
	addnewcustomerpage.setAddress("Regent Square Surat");
	addnewcustomerpage.setCity("Surat");
	addnewcustomerpage.setState("Gujarat");
	addnewcustomerpage.setPin("395009");
	addnewcustomerpage.setMobile("3698521471");
	addnewcustomerpage.setEmailid("abcdghhe@gmail.com");
	addnewcustomerpage.setPassword("password");
	addnewcustomerpage.clickSubmit();
	
	if(isAlertisPresent()==true)
	{
		
	Alert alert = driver.switchTo().alert();
	
	String alertText = alert.getText();
	
	System.out.println("=========="+alertText+"=================");
	
	alert.accept();
	}
	else if(driver.getPageSource().contains("Customer Registered Successfully!!!"))
	{
		
		Assert.assertTrue(true);
		
		System.out.println("Registration Sucessfully");
		
	System.out.println(driver.findElement(By.xpath("//*[@id='customer']")).getText());
	
	addnewcustomerpage.clickonNewCustomer();
		
	}
	else
	{
		
		Assert.assertTrue(false);
		
	}
	}
	

	 @Test(priority=2,description="Enter all valid Deatail and click On Reset button" )
	 
	 public void validateReset() throws IOException, InterruptedException
	 {
		 
		 addnewcustomerpage.setCustomerName("Kunal");
			addnewcustomerpage.setGender();
			addnewcustomerpage.setDOB();
			addnewcustomerpage.setAddress("Regent Square Surat");
			addnewcustomerpage.setCity("Surat");
			addnewcustomerpage.setState("Gujarat");
		 
	addnewcustomerpage.clickReset();	
	
	String exceptedUrl =driver.getCurrentUrl();
	
	Assert.assertEquals(actualUrl, exceptedUrl);
		 
	 }
	 
	 
	 @Test(priority=3,description="Validate all field By giving -ve Input")
	 
	 public void validateFirstNameTest()
	 {
		  String exceptedError ="Customer name must not be blank";

		 addnewcustomerpage.setCustomerName("");
		 addnewcustomerpage.setAddress("");
		 
		String errorActual=  driver.findElement(By.xpath("//*[text()='Customer name must not be blank']")).getText();
		System.out.println(errorActual);
		 
		 addnewcustomerpage.setAddress("");
        addnewcustomerpage.validateFirstName();
		Assert.assertEquals(errorActual, exceptedError); 
		
		
	 }
	
 @Test(priority=4,description="Validate Pin")
	 
	 public void validatePinTest()
	 {
	 addnewcustomerpage.clickReset();
	 addnewcustomerpage.validatePin(); 
	 addnewcustomerpage.clickonNewCustomer();
	 
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
