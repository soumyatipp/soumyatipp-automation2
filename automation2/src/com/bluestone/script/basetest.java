package com.bluestone.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.bluestone.generic.iautoconst1;
import com.bluestone.generic.libblue;
import com.bluestone.generic.libblue;

public class basetest implements iautoconst1
{
	public static WebDriver driver;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

public static void openapplication1()
{
	
    driver=new ChromeDriver();
	String url = libblue.getproperty(CONFIG_PATH, "URL");
	driver.get(url);
	Reporter.log("application opned",true);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}


public static void closeapplication1()
{
	driver.close();
}
}

