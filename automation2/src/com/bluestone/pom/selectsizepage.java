package com.bluestone.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class selectsizepage 
{
	@FindBy(id="ringselect")
	private WebElement sizeofring;
	
	@FindBy(id="buy-now")
	private WebElement buynowbtn;
	
	public selectsizepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectringbasedonsize(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Select listbox=new Select(sizeofring);
		listbox.selectByIndex(1);
		Reporter.log("size of the ring is selected",true);
	}



	public void buynowbtnclick(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		buynowbtn.click();
		Reporter.log("size of the ring is selected and click on the buy now button",true);
		
	}

}
