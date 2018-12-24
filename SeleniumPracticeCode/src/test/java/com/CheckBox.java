package com;

import java.util.List;

import org.apache.poi.hpsf.Section;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBox {
	
	WebDriver driver;
	
	@Test(priority=1)
	
	public void testCheckbox()
	{
		
		driver = new ChromeDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-form");	
	driver.manage().window().maximize();
	}	
	
	
	
	
	// for radio Button 
	@Test(priority=2)
	public void radioButtonTest()
	{
	List<WebElement> allradioibutton = driver.findElements(By.xpath("//*[@type='radio']"));
	
	int radioSize = allradioibutton.size();
	
	System.out.println(radioSize);
	
	boolean sex =true;

	  
	  if(sex)
	  {
		  
		allradioibutton.get(0) .click(); 
		  
		System.out.println("Male");
	  }
	  
	  else
	  {
		  
		allradioibutton.get(1) .click();
		
		
		System.out.println("fMale");
  
	  
  }
	
	for(int i=0;i<radioSize;i++)
	{
		
		if(allradioibutton.get(i).getAttribute("value").contains("7"))
		{
			
		allradioibutton.get(i)	.click();
		break;
			
			
		}
		
		
		
	}
	
	
	}
	
	
	@Test(priority=3)
	
	public void checkBox()
	{
	List<WebElement> allcheckBox = driver.findElements(By.xpath("//*[@type='checkbox']"));
	
	
	int checkBoxSize = allcheckBox.size();
	
	System.out.println("Total CheckBox in Given web Page is :::"+checkBoxSize);
	
	for(int i=0;i<allcheckBox.size();i++)
	{
		
		String checkBoxText = allcheckBox.get(i).getAttribute("value");
		
		System.out.println(checkBoxText);
		
		if(allcheckBox.get(i).getAttribute("value").contains("Automation Tester")) {
			
			
			System.out.println("CheckBox found");
			
			allcheckBox.get(i).click();
	
			break;
		}
		
		
		
		
	}
	
		}
	
                     @Test(priority=4)
	
	              public void selectTest()
	            {
		
		
		List<WebElement> selectall = driver.findElements(By.tagName("select"));
		
		int sSize=selectall.size();
		
		System.out.println("Select Size::::"+sSize);
		
		Select select = new Select(selectall.get(0));
		
		if(select.isMultiple())
		{
			
			System.out.println("Sele is Multiple ");
			
			
			select.selectByIndex(1);
			select.selectByIndex(2);
			
			
		}
		else 
		{
			
			select.selectByIndex(4);
			
		}
		
		
		Select oselect = new Select(selectall.get(1));
				
		if(oselect.isMultiple())
		{
			
			oselect.selectByIndex(0);
			oselect.selectByIndex(1);
			oselect.selectByIndex(2);
			
			
		}
		
		else
		{
			
			oselect.selectByIndex(3);
			
		}
		
	List<WebElement>	ss=oselect.getAllSelectedOptions();
	  for(int i=0;i<ss.size();i++)
		  
		  
	  {
		  
	String sss = ss.get(i).getText();
	
	System.out.println(sss);
		  
		  
	  }
	
	
	
     
		
	              }
	

}
