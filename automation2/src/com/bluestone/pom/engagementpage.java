package com.bluestone.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class engagementpage
{
@FindBy(xpath="(//img[@alt='The Florial Ring'])[1]")
private WebElement image1;

public engagementpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void title(WebDriver driver,String etitle)
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	try
	{
	wait.until(ExpectedConditions.titleIs(etitle));
	Reporter.log("title is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("title is not present",true);
		Assert.fail();
	}
}

public void clickonimage(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);

//	Actions action=new Actions(driver);
//	action.moveToElement(image1).perform();
	image1.click();
	
	Reporter.log("click on image",true);
}
}
