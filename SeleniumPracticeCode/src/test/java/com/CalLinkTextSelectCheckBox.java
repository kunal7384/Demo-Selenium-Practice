package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CalLinkTextSelectCheckBox {
	
	
	WebDriver driver;
	@Test
	
	public void tool() throws InterruptedException
	{
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	
	//Size of Link
	List<WebElement> list = driver.findElements(By.tagName("a"));
	
	int listSize= list.size();
	
	System.out.println(listSize);
	
	for(int i=0;i<list.size();i++)
	{
		
	String linktext= list.get(i).getText();
	
	System.out.println("Link Text" +linktext);
		
		
	}
	
	
	//Size of Select 
	
	List<WebElement> select = driver.findElements(By.tagName("select"));
	
	int slectSize= select.size();
	
	System.out.println("Size of The Select Boxex is "+ slectSize);
	
	
	for(int i=0;i<select.size();i++) 
	{
		
	String selectText = select.get(i).getText();
	
	
	System.out.println("Select Text is"+selectText);
		
	}
	
	//Size of Input Text Box 
	
	
List<WebElement> inputBox = driver.findElements(By.xpath("//*[@type='text']"));

 int inputBoxSize = inputBox.size();
 
  System.out.println("InputBox Size is" +inputBoxSize);
  
  // Size of CheckBox 
  
  
  
  List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
      
		int checkBoxSize = checkBox.size();
  
  
  System.out.println("checkBoxSize is ::" +checkBoxSize);
  
 
  
  // size if Radio Button
  
  
  List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
  
  int radiosize = radio.size();
  
  
  System.out.println("Size of The radio Button is::"+radiosize);
  
  
 
		  
		
	}

}
