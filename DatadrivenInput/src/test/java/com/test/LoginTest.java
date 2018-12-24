package com.test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utility.ReadExcel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginTest extends BaseClass {
	
    ReadExcel read ;
    
    
    LoginPage loginpage;
	String uid;
	
	String pass;
	
	@Test(priority=1)
	public void testlogin() throws InterruptedException
	{
		
		
    driver.get("http://demo.guru99.com/V4/");
	loginpage = new LoginPage(driver);
	
	read = new ReadExcel("F:\\Selenium November Code 2018\\DatadrivenInput\\src\\test\\java\\testdata\\logindata.xls");
    loginpage.setUserName(read.getData(0, 1));
    
     System.out.println(read.getData(1, 1));
     loginpage.setPassword(read.getData(1, 1));
	
   
	  loginpage.setClickLogin();
	  
	  loginpage.clickLogOut();
	
	  if(isAlertisGenarate()==true)
	  {
		Alert ale = driver.switchTo().alert();
		
	String aleText=	ale.getText();
		System.out.println("Tc1" + aleText);
		  ale.accept();
	  }
	  else
	  {
		  
	System.out.println("Alert is Not Present ");
	  }
		
		
	}
	
	public boolean isAlertisGenarate()
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
		@Test(priority=2,dataProvider="testing")
		public void loginDdt( String uid ,String pass)
		{
	
	

		
		
		loginpage.setUserName(uid);
		System.out.println(uid);
		loginpage.setPassword(pass);
		loginpage.setClickLogin();
		
			if(isAlertisGenarate()==true)
		{
			
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		
		System.out.println("TC2"+alertText);
		
		alert.accept();
			
		
	}	
		else
		{
			
		System.out.println("Login Successfully");	
		
		loginpage.clickLogOut();
		Alert alert1 = driver.switchTo().alert();
		String alertTextSucceess = alert1.getText();
		System.out.println("Alert Success Message ::"+alertTextSucceess);
		alert1.accept();
			
		}
		}
		
	
	@DataProvider(name="testing")
	
	public String[][] getDataExcel() throws BiffException, IOException
	{
		
		File file = new File("F:\\Selenium November Code 2018\\DatadrivenInput\\src\\test\\java\\testdata\\logindata.xls");
		
		
		
		Workbook wb = Workbook.getWorkbook(file);
		
		Sheet st = wb.getSheet(0);
		
		int row = st.getRows();
		int col = st.getColumns();
		
		String[][] data = new String[row][col];
	//	int k =0;
		
	//	int t=0;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				
					
				
				Cell cell = st.getCell(j,i);
				
				data[i][j]= cell.getContents();
				
				System.out.println(data[i][j]);
				
			}
			
			
		}
		
				
		
	
		return data;
	
	}
}
