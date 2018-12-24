package com.bank.selenium.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bank.selenium.testutility.ConfigReader;
import com.bank.selenium.testutility.ReadExcelData;

public class BaseClass {
	
	ConfigReader con = new ConfigReader();
 
    public  final String url =con.getUrl();
	
	public final String UserName = con.getUserName();
	
	public final String password = con.getUserPassword();
	
	public static WebDriver driver ;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
		
	if(browser.equalsIgnoreCase("chrome"))
	{
		
		driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
		
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
		
		
	
		
		
		
		driver.manage().window().maximize();
		
		
	}
 	
	
	driver.get(con.getUrl());
	
	}
	
	public void getScreenShot(String testName) throws IOException
	{
		
TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
	
		 File target = new File(System.getProperty("user.dir")+"/ScreenShot/" +testName +".PNG");
		 FileUtils.copyFile(source, target); 
			
		 
	}
	
	
	   @AfterClass
	
     public void closeBrowser()
     {
		
		driver.close();
		
		
     }
	   
	   public String[][] getExcelDataForLogin(String pathofFile , String sheetNameofFile) throws IOException
	   {
		   
		   ReadExcelData read = new ReadExcelData();
	//	return read.getExcelData(System.getProperty("user.dir")+"/src/test/java/com/bank/selenium/testdata/test.xls", "Sheet1");
		   
		return read.getExcelData(pathofFile, sheetNameofFile)  ;
		   
		   
	   }
	
}
