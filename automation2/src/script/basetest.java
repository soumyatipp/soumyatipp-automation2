package script;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import gen.Iauto;
import gen.lib;

public class basetest implements Iauto
{
	public WebDriver driver;
	
static
{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	System.setProperty(GECKO_KEY, GECKO_VALUE);
}
@Parameters({"node","browser"})

	@BeforeMethod
	public void openapplication(String node,String browser) throws MalformedURLException
	{
		URL whichsystem=new URL(node);
		DesiredCapabilities whichbrowser=new DesiredCapabilities();
		whichbrowser.setBrowserName(browser);
		driver=new RemoteWebDriver(whichsystem,whichbrowser);
		String url=lib.getproperty(CONFIG_PATH,"URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeapplication()
	{
		driver.close();
	}
}
