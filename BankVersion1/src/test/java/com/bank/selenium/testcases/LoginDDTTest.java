package com.bank.selenium.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.selenium.pages.LoginPage;
import com.bank.selenium.pages.LoginddtPage;
import com.bank.selenium.testutility.WriteExcel;

public class LoginDDTTest extends BaseClass {
	
	LoginPage loginpage;
    LoginddtPage loginddtpage;
    

	@Test(dataProvider="logindata")

	public void testLoginDDt(String uid , String upass)
	{
		
		loginddtpage = new LoginddtPage(driver);
		
		loginddtpage.setUserName(uid);
		
		loginddtpage.setPassword(upass);
		
		loginddtpage.setClickLogin();
		
		
		if(isAlertisPresent()==true)
		{
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Error Message For InValid Login is ::"+alertText);
		alert.accept();
		
		System.out.println("Invalid Login You have Enter ::"+"UserId::" +uid + "and password is::"+upass);
			
		Assert.assertEquals(alertText, "User or Password is not valid");
		}
		
		else
		{
		System.out.println("Login Sucessfully for User::" +uid + " and password is ::" + upass);	
		loginddtpage.clickLogOut();
		Alert alert = driver.switchTo().alert();
		String alertTextSucceess = alert.getText();
		System.out.println("Alert Success Message ::"+alertTextSucceess);
		alert.accept();
		
		Assert.assertEquals(alertTextSucceess, "You Have Succesfully Logged Out!!");	
		}
		
		try {
			writeDatainExcel();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			// TODO: handle exception
			
			return false;
		}
	}
	
	
	public void writeDatainExcel() throws InvalidFormatException, IOException
	{
		
		WriteExcel write = new WriteExcel();
		
		write.writeExcelSheet(0, 2, "Result");
		write.writeExcelSheet(1, 2, "Fail");
		
		write.writeExcelSheet(2, 2, "Fail");
		
		write.writeExcelSheet(3, 2, "Pass");
		
		
	}
	
	
	@DataProvider(name="logindata")
	public String[][] data() throws IOException
	{
		
		return getExcelDataForLogin(System.getProperty("user.dir")+"/src/test/java/com/bank/selenium/testdata/test.xls", "Sheet1");
	
		
	}

}
