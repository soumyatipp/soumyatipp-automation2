package com.shopclues.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNgListners implements ITestListener, ISuiteListener, IInvokedMethodListener{

	public WebDriver driver;
	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		Reporter.log("Started executiong on Suite level");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		Reporter.log("Execution STOPS AT Suite level");
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		  TakesScreenshot s=(TakesScreenshot)driver;
		  File scrFile = s.getScreenshotAs(OutputType.FILE);
		  File destfile = new File("D:\\screenshot.png");
          //The below method will save the screen shot in d drive with name "screenshot.png"
             try {
				FileUtils.copyFile(scrFile, destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Reporter.log("taking screenshot failed",true);
			}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 TakesScreenshot s=(TakesScreenshot)driver;
		  File scrFile = s.getScreenshotAs(OutputType.FILE);
		  File destfile = new File("./ScreenShot+System.currentTimeMilli()+.png");
         //The below method will save the screen shot in d drive with name "screenshot.png"
            try {
				FileUtils.copyFile(scrFile, destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Reporter.log("taking screenshot failed",true);
			}
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
