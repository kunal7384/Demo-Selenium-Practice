package com.test;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.utility.ReadExcel;

public class HomeTest extends BaseClass {
	
	
	HomePage homepage ;
	ReadExcel read;
	
	@Test
	
	public void testSearchEle()
	{
		
		homepage = new HomePage(driver);
		
		read = new ReadExcel("F:\\Selenium November Code 2018\\DatadrivenInput\\src\\test\\java\\testdata\\data.xls");
		homepage.setSearch(read.getData(0, 1));
		
          
		
	}
	

}
