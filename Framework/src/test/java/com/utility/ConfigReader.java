package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader {
	
	WebDriver driver;
	
	
	Properties pro;
	
	
	
	
	
	public ConfigReader() 
	{
		
		try {
			File file = new File(System.getProperty("user.dir") +"/Config/config.properties");
			
			FileInputStream fis = new FileInputStream(file);
			
			pro = new Properties();
			
			pro.load(fis);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getUrl()
	{
		
	String Url = pro.getProperty("baseurl")	;
	return Url;
		
		
	}
	
	public String getUsername()
	{
		
	String name = pro.getProperty("uName")	;
	return name;
		
		
	}

	
	public String getPassword()
	{
		
	String PassWord = pro.getProperty("Pass")	;
	return PassWord;
		
		
	}
	
	
}
