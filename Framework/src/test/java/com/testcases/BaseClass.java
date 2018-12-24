package com.testcases;

import java.io.File;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.utility.ConfigReader;
import com.utility.ExcelRead;

public class BaseClass {
	
	
	 
	
	ConfigReader con = new ConfigReader();
	public static WebDriver driver;
	public String url =con.getUrl();
	public String UserName =con.getUsername();
	
	public String passWord= con.getPassword();
	
Logger logger = LogManager.getLogger(BaseClass.class);
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws MalformedURLException
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://192.168.100.17:4444/wd/hub");
		 logger.info("hgdhghcgd");
		 
		 logger.error("test");
		 driver=new RemoteWebDriver(url, cap);
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		} 
		 
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			// System.setProperty("webdriver.gecko.driver","F:\\Selenium November Code 2018\\Framework\\Driver\\geckodriver.exe"); 
			  
		      if (browser.equalsIgnoreCase("firefox")) {
		         System.out.println(" Executing on FireFox");
		         String Node = "http://192.168.100.17:44444/wd/hub";
		         DesiredCapabilities cap = DesiredCapabilities.firefox();
		         cap.setBrowserName("firefox");
		         
		         driver = new RemoteWebDriver(new URL(Node), cap);
		         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		         
		      
		         driver.manage().window().maximize();
		      }	
	}
		driver.get(url);
	
	
	}
	
	
	 public void addScreenShot(String testName) throws IOException
	 {
		 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir")+"/Screenshot/" +testName+".PNG");
		 
		 FileUtils.copyFile(source, target);
		 
	 }
	 
	 
	 public boolean isAlertisPresent()
	 {
		 
		 try
		 {
		 driver.switchTo().alert();
		 
		 return true;
		 
		 } catch (NoAlertPresentException e) {
			
			 
			 System.out.println("Alert is not present ");
			 
			 return false;
		}
		
		 
	 }
	 public String[][] excelData(String path , String sheetName) throws IOException
	 {
		 ExcelRead excel = new ExcelRead();
		 
		 return excel.getExceldata("F:\\Selenium November Code 2018\\Framework\\src\\test\\java\\com\\testdata\\test.xls", "Sheet1");
		 
		 
	 }
			

}
