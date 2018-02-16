package com.acttime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleList implements ITestListener{
	@Override
	public void onTestFailure(ITestResult t) {
		String failedTestNAme = t.getMethod().getMethodName();
       EventFiringWebDriver Ed = new EventFiringWebDriver(BaseClass.driver);
       File srcFiel = Ed.getScreenshotAs(OutputType.FILE);
       //create a new File
       File dfile = new File("D://s//"+failedTestNAme+".png");
       try {
		FileUtils.copyFile(srcFiel, dfile);
	                                  } catch (IOException e) {}
	}
	
	
	
	
	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
