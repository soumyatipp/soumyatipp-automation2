package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class amazonhomepage 
{
	@FindBy(xpath="//a[.='Men']")
	private WebElement mentab;
	
	@FindBy(xpath="//a[.='T-shirt & Polos']")
	private WebElement tshirt;
	
	@FindBy(id="autocomplete")
	private WebElement search;
	
	
	public amazonhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void menclick()
	{
	mentab.click();
	Reporter.log("clicked on men tab",true);
	}
	
public void tshirtclick()
{
tshirt.click();
	Reporter.log("clicked on tshirt tab",true);
}
	
	public void searchitems(String s,WebDriver driver)
	{
		System.out.println(s);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(s,Keys.ENTER);
		
	
	}
	

}
