package com.shopclues.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indianmulticolorsraeespage 
{
	@FindBy(xpath="//button[.='Add To Cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[@ tooltip='Black']")
	private WebElement color;
	
	@FindBy(xpath="//a [@class='cart_ic']")
	private WebElement cart;
	
	public indianmulticolorsraeespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void selectcolor()
	{
		color.click();
	}
	public void clickonaddtocart()
	{
		addtocart.click();
	}
	
	public void addedtocart()
	{
		cart.click();
	}
	

	
	

}
