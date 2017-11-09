package com.bluestone.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ringspage 
{

@FindBy(xpath="//a[@href='https://www.bluestone.com/jewellery/engagement-rings.html']")
private WebElement Engagement;

@FindBy(className="inner")
private WebElement rings;

public ringspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void mousehoveronringstab(WebDriver driver)
{

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	Actions action=new Actions(driver);

	action.moveToElement(rings).perform();
	Reporter.log("mousehover on rings tab1",true);

}

public void clickonengagementtab()
{
	Engagement.click();
	Reporter.log("engagement tab has been clicke",true);
	
}

}
