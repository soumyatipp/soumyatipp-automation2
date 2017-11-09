package com.bluestone.pom;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class shopingbagpage 
{
	@FindBy(xpath="(//span[.='61,398'])[2]")
	private WebElement totalamt;
	
	@FindBy(xpath="//a[.=' Place Order ']")
	private WebElement placeorderbtn;
	
	@FindBy(xpath="//span[.='01 Item']")
	private WebElement cartitem;
	
	public shopingbagpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifytheamount(WebDriver driver,String total)
	{
		String amount=totalamt.getText();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		try
		{
		Assert.assertEquals(amount, total);
		Reporter.log("total is verified",true);
		}
		catch(Exception e)
		{
			
			Reporter.log("total is not verified",true);
			Assert.fail();
		}
	}
	
	
	public void checkitemaddedtocart(WebDriver driver,int ecount)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		try
		{
		String count=cartitem.getText();
		String intValue = count.replaceAll("[^0-9]", "");
		int acount=Integer.parseInt(intValue);
		Assert.assertEquals(acount, ecount);
		Reporter.log("item is added to cart",true);
		}
		catch(Exception e)
		{
			Reporter.log("item is not added to cart",true);
			Assert.fail();
		}
	}
	public void clickonplaceorder(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		placeorderbtn.click();
		Reporter.log("clicked on placeorder",true);
		
	}
}
