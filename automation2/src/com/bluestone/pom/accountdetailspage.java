package com.bluestone.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class accountdetailspage 
{
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="userName")
	private WebElement name;
	
	@FindBy(id="customer_phone")
	private WebElement phonemuner;
	
	@FindBy(xpath="//input[@value='Save & Continue']")
	private WebElement saveandcontinue_button;
	
	public accountdetailspage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void enteremail(WebDriver driver,String mail)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		emailid.sendKeys(mail);
		Reporter.log("mail id is entered",true);
	}
	
	public void entername(WebDriver driver,String nameofuser)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		name.sendKeys(nameofuser);
		Reporter.log("name is entered",true);
	}
	public void enterphonenumber(WebDriver driver,String userphno)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		phonemuner.sendKeys(userphno);
		Reporter.log("phonenumer is entered",true);
	}
	public void saveandcontinuebutton(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		saveandcontinue_button.click();
		Reporter.log("clicked on button",true);
	}

}
