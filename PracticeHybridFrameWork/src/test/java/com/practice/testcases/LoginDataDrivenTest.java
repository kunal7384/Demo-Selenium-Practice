package com.practice.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.practice.pageobject.pages.LoginDataDrivenPage;
import com.practice.pageobject.pages.LoginPage;
import com.practice.utility.WriteExcel;

public class LoginDataDrivenTest extends BaseClass {
	
	LoginPage login;
	LoginDataDrivenPage logindtt;
	
	WriteExcel writeexcel;
	
	@Test(priority =10,description="Data Driven Testing For Login ")
	public void login()
	{
		
		
		login = new LoginPage(driver);
    	login = new LoginPage(driver);
    	login.click_Login();
    	
		
		
	}
	
	
	
	@Test(priority =11,dataProvider ="logintest" ,description="Data Driven Testing For Login")
	public void logindata_driver(String uid , String upassword) throws InterruptedException
	{
		logindtt = new LoginDataDrivenPage(driver);
		logindtt.set_email(uid);
		Thread.sleep(1000);
    	logindtt.set_pass(upassword);
    	Thread.sleep(1000);
    	logindtt.click_login();
    	Thread.sleep(1000);
    	if(isAlertisPresemt()==true)
    	{
    		
    		Alert alert = driver.switchTo().alert();
    		
    		String alerttext=	alert.getText();
    		
    		System.out.println("Alert is Present " + alerttext+ "for user" +uid);
    		alert.accept();
    	//	logindtt.clear_email();
    	//	logindtt.clear_pass();
    		
    		
    	}
    	
    	else
    	{
    		Thread.sleep(2000);
    		logindtt.click_logout();
    		
    	logindtt.click_homelogin();
    		
    		System.out.println("Login Sucess");
    		
    		
    		
    	}			
    	try {
			writeDatainExcel();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	public void writeDatainExcel() throws InvalidFormatException, IOException
	{
		
		writeexcel = new WriteExcel();
		
		writeexcel.writeexcel(1, 2, "Valid");
		writeexcel.writeexcel(2, 2, "InValid");
		writeexcel.writeexcel(3, 2, "InValid");
		writeexcel.writeexcel(4, 2, "InValid");
		writeexcel.writeexcel(5, 2, "Valid");
	
		
		
		
	}
	
	
	
	
	
	
	public boolean isAlertisPresemt()
	{
		
		try
		{
		driver.switchTo().alert();
	
	return true;
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			return false;
		}
		
			
		}
		
		@DataProvider(name="logintest")
		
		public String[][] dataSource() throws IOException
		{
			
			return getExceldataforlogin(System.getProperty("user.dir")+"/src/test/java/com/practice/testdata/logindata.xls", "Sheet1");
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


