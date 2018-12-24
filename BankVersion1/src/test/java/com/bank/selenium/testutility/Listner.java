package com.bank.selenium.testutility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bank.selenium.testcases.BaseClass;

public class Listner implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Case Execution Start"+":::"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Execution Sucessfully "+"  ::" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		BaseClass base = new BaseClass();
		
		try {
			base.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		// TODO Auto-generated method stub
	
		System.out.println("Test Case Execution Start "+"  ::" + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Case Execution Finished "+"  ::" + context.getName());
		
		
	}

}
