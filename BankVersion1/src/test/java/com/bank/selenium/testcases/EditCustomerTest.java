package com.bank.selenium.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.selenium.pages.EditPage;
import com.bank.selenium.pages.LoginPage;
import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class EditCustomerTest extends BaseClass {
	
	LoginPage loginpage;
	
	EditPage editpage;
	
	String path ="F:\\Selenium November Code 2018\\BankVersion1\\src\\test\\java\\com\\bank\\selenium\\testdata\\edit.xls";
	
	@Test(priority=1)
	
	public void Login()
	{
		
		loginpage = new LoginPage(driver);
		
		loginpage.setUserName(UserName);
		
		loginpage.setPassword(password);
		
		loginpage.setClickLogin();
		
		
	}
	
	
	@Test(priority=2 ,dataProvider="editcustomer")
	
	public void editCustomerDdt(String cid)
	{
		editpage = new EditPage(driver);
		
		
		editpage.clickonEditCustomer();
		
		editpage.setCustomerId(cid);
		
		editpage.clickSubmit();
		
		
		if(alertisPresent()==true)
		{
			
			Alert alert = driver.switchTo().alert();
			
			String atext = alert.getText();
			
			System.out.println("=============Alert is Present for Cuastomer id ::"+cid +atext);
			
		
			alert.accept();
			
			System.out.println("InValid Customer Id  Enter " +cid);
		}	
			
			else if(driver.getCurrentUrl().equals("http://demo.guru99.com/V4/manager/editCustomerPage.php"))
			{
				
				System.out.println("Valid Customer Id  Enter " +cid);
				
			
				Assert.assertTrue(true);
				
			}
			
		
		
		
	}
	
	/*
	
        @DataProvider(name="editcustomer")
	
	public String[] getData() throws BiffException, IOException
	{
		
		File file = new File(path);
		
		
		FileInputStream fis  =new FileInputStream(file);
		
		
		Workbook wb = Workbook.getWorkbook(file);
		
		
		Sheet st = wb.getSheet(0);
		
		
	   int row = st.getRows();
	   
	   String[] data = new String [row];
	   int j =0;
	   int t =0;
		for(int i=0;i<row;i++)
		{
			
			if(j++!=0)
			{
				
			int k =t;	
				
			t++;	
			
			
			data[i] = st.getCell(0, i).getContents();
			
			System.out.println("=="+data[i]);
			
			}	
		}
		return data;
		
	}
	*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name="editcustomer")
	public String[] getData() throws BiffException, IOException
	{
		
		File file = new File(path);
		
		
		FileInputStream fis  =new FileInputStream(file);
		
		
		Workbook wb = Workbook.getWorkbook(file);
		
		
		Sheet st = wb.getSheet(0);
		
		
	   int row = st.getRows();
	   
	   String[] data = new String [row];
	   
		for(int i=0;i<row;i++)
		{
			
			
			data[i] = st.getCell(0, i).getContents();
			
			System.out.println(data[i]);
			
			
		}
		return data;
		
	}
	
	
	
	
	

	
	
	 public boolean alertisPresent()
	 {
		 
		 try
		 {
			 
			driver.switchTo().alert() ;
			
			return true;
		 }
		 
		 catch (NoAlertPresentException e) {
			// TODO: handle exception
			 
			 return false;
		}
	 }
}
