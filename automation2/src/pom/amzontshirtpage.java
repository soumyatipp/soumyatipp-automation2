package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class amzontshirtpage 
{
	
	
	
public amzontshirtpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}


public void title(WebDriver driver)
{
	String atitle=driver.getTitle();
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
	wait.until(ExpectedConditions.titleIs(atitle));
	Reporter.log("pass:title is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("fail:title is not present",true);
	Assert.fail();
	}
	
}

}
