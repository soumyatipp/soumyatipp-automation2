package com.shopclues.pom;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class saresspage
{
	
	@FindBy(xpath="//img[@id='det_img_85292617']")
	private WebElement sarresimage;
	
	
	public saresspage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void verifytitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("title is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not present",true);
			Assert.fail();
		}
		
	}
	
	public void scrooldowntosarees(WebDriver driver)
	{
		System.out.println("page is scrolling");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		int x=sarresimage.getLocation().getX();
		System.out.println(x);
		int y=sarresimage.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		System.out.println("page is scrolling down");
		
	}
	
	

	public void clickonsareesimage(WebDriver driver) {
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		sarresimage.click();
	}

}
