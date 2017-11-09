package com.bluestone.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class shippingdetailspage 
{
	@FindBy(id="countryId_delivery")
	private WebElement country;
	
	@FindBy(id="postcode_delivery")
	private WebElement pincode;
	
	@FindBy(id="alternatePhone")
	private WebElement alternativeno;
	
	@FindBy(id="address")
	private WebElement adress;
	
	@FindBy(id="cityName_delivery")
	private WebElement city;
	
	@FindBy(id="stateId_delivery")
	private WebElement state;
	
	@FindBy(xpath="//input[@value='Save & Continue']")
	private WebElement savebutton;
	
	public shippingdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void slectcountry(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select select=new Select(country);
	
		List<WebElement> alloptions = select.getOptions();
//		for(int i=0;i<alloptions.size();i++)
//		{
			WebElement option = alloptions.get(2);
			String text=option.getText();
			System.out.println(text);
			option.click();
//			String text=option.getText();
//			System.out.println(text);
//			try
//			{
		
//				if(text.equalsIgnoreCase("India"))
//		option.click();
//			Reporter.log("select india from listbox",true);
//			}
//			catch(Exception e)
//			{
//				
//				Reporter.log("select india from listbox but its not selected",true);
//				Assert.fail();
//			}
	}
	
	public void enterpincode(WebDriver driver,String pin)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pincode.sendKeys(pin);
		Reporter.log("pincode is entered",true);
	}
	
	public void enteralternativenumber(WebDriver driver,String phnonumber)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alternativeno.sendKeys(phnonumber);
		Reporter.log("phonenumber is is entered",true);
	}
	
	public void enteraddress(WebDriver driver,String addressofresidence)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		adress.sendKeys(addressofresidence);
		Reporter.log("Address is entered",true);
	}
	
	public void entercity(WebDriver driver,String cityname)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		city.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		city.sendKeys(cityname);
		Reporter.log("city is entered",true);
		
	}
//	public void slectstate(WebDriver driver)
//	{
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Select select=new Select(state);
//		List<WebElement> alloptions = select.getOptions();
//		for(int i=0;i<alloptions.size();i++)
//		{
//			WebElement option = alloptions.get(i);
//			String text=option.getText();
//			try
//			{
//			Assert.assertEquals(text, "Karnataka");
//			option.click();
//			Reporter.log("select india from listbox",true);
//			}
//			catch(Exception e)
//			{
//				Assert.fail();
//				Reporter.log("select india from listbox but its not selected",true);
//			}
//		}
//	}
	public void savebuttoncontinuebutton(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		savebutton.click();
		
	}

}
