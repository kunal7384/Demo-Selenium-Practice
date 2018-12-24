package com.grid;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikuli {
	
	static WebDriver driver;
	
	
	@Test
	
	public void aa() throws FindFailed, IOException
	
	{
		
		
	/*	Screen screen = new Screen();
		
		
		Pattern username = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\username.PNG");
		
		
		Pattern password = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\password.PNG");
		
		

		Pattern login = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\login.PNG");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.practice-pad.com/");
		
		driver.manage().window().maximize();
		
	screen.wait(username,10);
		
		screen.type(username ,"kunal");
		
		screen.type(password,"password");
		
		screen.click(login);   */
		
		
		
		
		// Reading Captcha Value 
		
	/*	driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/mantisbt/signup_page.php");
		driver.manage().window().maximize();
		
		
		
		
		//driver.switchTo().frame("demo_frame");
		Thread.sleep(2000);
		
		WebElement captch = driver.findElement(By.xpath("//*[@src='make_captcha_img.php']"));
		
		
		String captchaValue = captch.getText();
		
		System.out.println("Value of Captch is"+captchaValue);
		
	WebElement value =	driver.findElement(By.name("captcha"));
	
	
	String max = value.getAttribute("maxlength");
	
	System.out.println(max);
	
	if(max==null)
	{
		
	System.out.println("Not Any Text Limit");	
		
		
	}
	
	
	else
	{
		
	if(max.equals("5")) {
		
		System.out.println("Sel text limit is Five-====");
		
	}	
		
		
	}
		//driver.findElement(By.name("ValidateCaptchaButton")).click();
		
		
	
	value.sendKeys("aaaaaaaaaa");
	
	String cal  = value.getAttribute("value");
	
	int a=cal.length();
	
	System.out.println(a);	
	
		*/
		
		
		// Try to Run Java script Executor 
		
		 
		
	
		/*	driver = new ChromeDriver();
			
			 JavascriptExecutor js = (JavascriptExecutor)driver;	
			driver.get("http://52.221.226.245/");
			
			driver.manage().window().maximize();
			

   String titleOfthePage=js.executeScript("return document.title;").toString();
   
   System.out.println(titleOfthePage);
		
   
  // js.executeScript("window.scrollBy(400,300);");
   
   
  // js.executeScript("alert('Welcome To The What The Space WebSite For'); ");
   
   
   String Domain=js.executeScript("return document.domain;").toString();
   

 
 System.out.println(Domain);
 

   WebElement loginn= driver.findElement(By.xpath("//a[@class='signup-btn signin']"));
   
   
  // js.executeScript("arguments[0].click()", loginn);
   
   
 WebElement eee=  driver.findElement(By.xpath("//h3[contains(text(),'Featured Offices')]"));
   
   
   js.executeScript("arguments[0].scrollIntoView();",eee);
   
   
   */
		
		
		
		// Automate Authentication Window Pop up :::
	/*	Screen screen = new Screen();
		
		Pattern user = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\a.PNG");
		 
		
		Pattern pass = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\b.PNG");
		
		Pattern sign = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\ppad\\c.PNG");
		String url = "https://"+"aaaaa"+":"+"aaaa"+"@"+"www.engprod-charter.net" ;
	

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
	
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	/*	screen.wait(user,10);
		
		screen.type(user,"abcdef");
		
		
		screen.type(pass,"1235844");
		
		
		screen.click(sign);
		
		*/
		
		
		
		// Total Link And Capture Screen Shots
		
	
	/*	driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		int linksize = links.size();
		
		System.out.println(linksize);
		
		String l[] = new String[linksize];
		for(int i=0;i<links.size();i++) {
			
		l[i] =	links.get(i).getAttribute("href");
		
		String name = links.get(i).getText();  
				
		}	
		
		
		for(int i=0;i<links.size();i++) {
		
			driver.navigate().to(l[i]);
			
	
                  TakesScreenshot ts  =(TakesScreenshot)driver;
				
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File targer = new File("C:\\Users\\dkunal\\Desktop\\screen\\"+i+".png");
				
				 FileUtils.copyFile(source,targer);
				 System.out.println("done");
				 
				
					
			}
			*/
		
		
	// Tooltip Element--------------//
		
		
		
	/*	driver= new ChromeDriver();
		
		
		
		driver.get("http://demo.guru99.com/test/tooltip.html");
		
		
		
		WebElement download = driver.findElement(By.xpath("//*[text()='Download now']"));
		
		 
	           Actions act = new Actions(driver);
	           
	           
	         
	           
	           
	        //   act.clickAndHold(download).moveToElement(download).build().perform();
		
	       
	           
	     */  
	           
	           
	           //   System.out.println(driver.findElement(By.xpath("//div[@class='tooltip']")).getText());
	}	 
	
	
	 //   Print the calue of SubMEnu 
	
	
	
	      @Test  
	      
	      public void testing() throws InterruptedException
	      {
	    	WebDriver driver  = new ChromeDriver();
	    	
	    	driver.get("http://www.google.com");
	    	driver.manage().window().maximize();
	    
	    	List<WebElement>  text= driver.findElements(By.tagName("a"));
	    	
	    	
	    	
	    	for(int i=0;i<text.size();i++)
	    		
	    	{
	    		if(text.get(i).getText().contains("Images"))
	    		{
	    			
	    			System.out.println("String Found");
	    		String l = 	text.get(i).getAttribute("href");
	    		
	    		System.out.println(l);
	    		
	    		driver.navigate().to(l);
	    			
	    		Thread.sleep(3000);	
	    			break;
	    		}
	    		
	    		
            else
	    			
	    		{
	    			
	    			
	    			System.out.println("jfgsfgvhgvhdfbg");
	    		}
	    	}
	    	
	    	
	    	
	    	  
	    	  
	      }
	
	
				
				
			}
			
			
	
	



