package com.shopclues.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	@FindBy(xpath="//a[.='Women']")
	private WebElement womentb;
	
	@FindBy(xpath="//a[.='Sarees']")
	private WebElement sareeslink;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mousehoveronwomen(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		womentb.click();
//		Actions actions=new Actions(driver);
//		actions.moveToElement(womentb).perform();
	}
	public void clickonsarees(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		sareeslink.click();
	}

}
