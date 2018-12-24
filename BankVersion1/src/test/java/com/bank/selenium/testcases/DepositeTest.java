package com.bank.selenium.testcases;

import org.testng.annotations.Test;

import com.bank.selenium.pages.DepositePage;
import com.bank.selenium.pages.LoginPage;

public class DepositeTest extends BaseClass{
	
	LoginPage loginpage;
	DepositePage depositepage;
	@Test
	
	public void testDepositeReset()
	{
		
		loginpage = new LoginPage(driver);
		
		loginpage.setUserName(UserName);
		loginpage.setPassword(password);
		loginpage.setClickLogin();
		
		depositepage = new DepositePage();
		
		depositepage.clickonDeposite(driver).click();
		
		
		depositepage.setAccountNumber(driver).sendKeys("11111");
		depositepage.setAmount(driver).sendKeys("200");
		depositepage.setDescription(driver).sendKeys("Sending Money to Kunal");
		depositepage.clickonReset(driver).click();
		
		
	}

}
