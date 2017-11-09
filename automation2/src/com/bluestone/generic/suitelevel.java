package com.bluestone.generic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.bluestone.script.basetest;

public class suitelevel 
{
	@BeforeSuite
	public void openapplication()
	{
		basetest.openapplication1();
	}
	
	@AfterSuite
	public void closeapplication()
	{
		basetest.closeapplication1();
		
	}

}
