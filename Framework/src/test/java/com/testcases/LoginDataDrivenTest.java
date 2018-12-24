package com.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.LoginDataDrivenPage;
import com.utility.ExcelWrite;

public class LoginDataDrivenTest extends BaseClass {
	
	LoginDataDrivenPage loginddt;
	
	LoginTest logintest ;
	
	ExcelWrite write; 
	
	
	
	@Test(priority=3,dataProvider="login")
	
	public void loginDataDriven(String uid ,String upass) 
	{
		loginddt = new LoginDataDrivenPage(driver);
		
		loginddt.getUserNameDdt(uid);
		loginddt.getpasswordDdt(upass);
		
		loginddt.ddtLogin();
		

		
		if(isAlertisPresent()==true)
		{
			 Alert alert = driver.switchTo().alert();
			
			 String alertText = alert.getText();
			 System.out.println(alertText);
		  	  alert.accept();	
	         Assert.assertTrue(true);
	         System.out.println("Invalid Login"+ uid +upass);
	
		}
		
		else
		{
			
			  Assert.assertTrue(true);
			  loginddt.logOut();
			  Alert alert = driver.switchTo().alert();
			
			  String alertText = alert.getText();
			  System.out.println(alertText);
			  alert.accept();
		
			  System.out.println("Login Sucessfull"+ uid +upass);
		}
		
		
		
		
	}
   
	

	@Test(priority=4)
	
	public void aa() throws InvalidFormatException, IOException
	{
		
	 write = new ExcelWrite();
	 
	 ExcelWrite.writeexcel("F:\\Selenium November Code 2018\\Framework\\src\\test\\java\\com\\testdata\\testwrite.xls", 1, 2, "Invalid Login");
		
	 ExcelWrite.writeexcel("F:\\Selenium November Code 2018\\Framework\\src\\test\\java\\com\\testdata\\testwrite.xls", 2, 2, "Invalid Login");
	}
	
	@DataProvider(name="login")
	
	public String[][] dataForDataDriven() throws IOException
	{
		
		return excelData("F:\\Selenium November Code 2018\\Framework\\src\\test\\java\\com\\testdata\\test.xls", "Sheet1") ;
		
		
	}

}
