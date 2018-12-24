package com.bank.selenium.testcases;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.selenium.pages.DepositeDataDriven;
import com.bank.selenium.pages.LoginPage;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DepositeDataDrivenTest extends BaseClass{
Workbook wb;
Sheet st;
	LoginPage loginpage;
	
	DepositeDataDriven depositeddt;
	
	@Test
	
	public void login() throws InterruptedException {
		
		
		loginpage= new LoginPage(driver);
		
		loginpage.setUserName(UserName);
		loginpage.setPassword(password);
		loginpage.setClickLogin();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority=2,dataProvider="depositetest")
	
	
	public void testDepositeDataDriven(String accid , String amtid) throws InterruptedException
	{
	
	
	depositeddt = new DepositeDataDriven(driver);
	
	depositeddt.clickonDeposite();
	
	depositeddt.setAccountNumber(accid);
	
	depositeddt.setAmount(amtid);
	
	depositeddt.setDescription();
	
	depositeddt.clickonSubmit();
	
	if(alertpresent()==true)
	{
		
		Alert alert = driver.switchTo().alert();
		
		String depositeAlertText = alert.getText();
		
		System.out.println(depositeAlertText);
		
		System.out.println("Invalid Account id is::"+accid);
		alert.accept();
	}
	
	else
	{
		
		System.out.println("valid Account Id is ::" +accid);
		
		System.out.println(driver.findElement(By.id("deposit")).getText());
		depositeddt.clickonDeposite();
	}
	}
	
	
	
	public boolean alertpresent()
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
	
	
	
	
	@DataProvider(name="depositetest")
	
	public String[][] getDepositeData() throws IOException, BiffException
	{
		
		
			
		File src = new File("F:\\Selenium November Code 2018\\BankVersion1\\src\\test\\java\\com\\bank\\selenium\\testdata\\deposite.xls")	;
		
		Workbook wb = Workbook.getWorkbook(src);
			
			Sheet sh = wb.getSheet(0);
			int nor = sh.getRows();
			int col = sh.getColumns();
		String[][]  data = new String[nor][col]	;
		
		for(int i =0;i<nor;i++)
		{
			
	     for(int j=0;j<col;j++)
	     {
	    	 
	    	Cell c = sh.getCell(j, i) ;
	    	data[i][j] = c.getContents();
	    	
	    	System.out.println(data[i][j]);
	     }
			
		}
		return data;
	
	}}
