package com.shopclues.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class cartpage 
{
	@FindBy(xpath="//a [@class='cart_ic']")
	private WebElement cart;
	
	
	public cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addedtocartitems(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("item is added to cart",true);
	}
}
