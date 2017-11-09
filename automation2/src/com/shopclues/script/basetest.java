package com.shopclues.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.shopclues.generic.iautoconst;
import com.shopclues.generic.lib;
@Listeners(com.shopclues.generic.TestNgListners.class)
public abstract class basetest implements iautoconst
{
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeSuite
	public void openapplication()
	{
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		String url=lib.getproperty(CONFIG_PATH, "URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void closeapplication()
	{
		driver.close();
	}

}
