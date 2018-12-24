package com.utility;

import java.io.IOException;

import javax.xml.transform.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testcases.BaseClass;

public class Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case Sucessfully Passed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	    try {
			BaseClass base = new  BaseClass();
			base.addScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Skiiped Test Case " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case Execution Start" +"  "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case Execution Finished" +"  "+context.getName());
	}

}
