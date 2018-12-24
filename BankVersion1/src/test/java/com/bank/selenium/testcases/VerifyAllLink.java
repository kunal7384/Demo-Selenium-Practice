package com.bank.selenium.testcases;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyAllLink extends BaseClass{
	
	@Test
	public void verifyallLink()
	{
		
List<WebElement> allLink = driver.findElements(By.tagName("a"));

        int alllinks = allLink.size();
        
        System.out.println(alllinks);
		
		String[] all = new String[alllinks];
		
		for(int i=0;i<alllinks;i++)
		{
			
		String allLinkText=	allLink.get(i).getText();
		System.out.println(allLinkText);
		
		System.out.println("=====================");
		all[i]	=allLink.get(i).getAttribute("href");
		
		System.out.println(all[i]);
		verifyLinkActive(all[i]);
		
		
		}
		}
		public static void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
		
	}
	
	

}
