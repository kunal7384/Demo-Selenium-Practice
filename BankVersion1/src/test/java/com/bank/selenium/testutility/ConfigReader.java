package com.bank.selenium.testutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	File file;
	
	FileInputStream fis;
	
	Properties pro;
	
	
	public ConfigReader()
	
	
	{
		
		
	try {
		file = new File(System.getProperty("user.dir")+"/configuration/"+"bank.properties")	;
			
		fis = new FileInputStream(file);
		
		pro = new Properties();
		
		pro.load(fis);
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	   public String getUrl()
	   {
		   
		String URL = pro.getProperty("basdeUrl")  ;
		return URL; 
		   
		   
	   }
	   
	   public String getUserName()
	   {
		   
		String userName  = pro.getProperty("userName")  ;
		return userName; 
		   
		   
	   }
	   
	   
	   public String getUserPassword()
	   {
		   
		String userPassWord  = pro.getProperty("password")  ;
		return userPassWord;
		
		   
		   
	   }
	   
	
}
