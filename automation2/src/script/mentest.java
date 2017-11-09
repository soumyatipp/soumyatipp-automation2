package script;

import org.testng.annotations.Test;

import gen.lib;
import pom.amazonhomepage;

public class mentest extends basetest
{
	
@Test(priority=1)
public void click() throws InterruptedException
{
	amazonhomepage a=new amazonhomepage(driver);
	Thread.sleep(1000);
	
	String item1=lib.getcellvalue(XLPATH, "sheet", 0, 0);

	Thread.sleep(2000);
	a.searchitems(item1,driver);
	a.menclick();
	a.tshirtclick();

}
}
