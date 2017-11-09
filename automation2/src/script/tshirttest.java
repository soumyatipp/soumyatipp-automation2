package script;

import org.testng.annotations.Test;

import pom.amzontshirtpage;

public class tshirttest extends basetest
{
@Test(priority=2)
public void tshirtmethod()
{
	amzontshirtpage a1=new amzontshirtpage(driver);
	a1.title(driver);
}
}
