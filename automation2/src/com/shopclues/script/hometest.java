package com.shopclues.script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopclues.pom.homepage;
import com.shopclues.pom.saresspage;
@Listeners(com.shopclues.generic.TestNgListners.class)
public class hometest extends basetest
{
@Test(priority=1)
public void homepagemethod()
{
	homepage h=new homepage(driver);
	h.mousehoveronwomen(driver);
	h.clickonsarees(driver);
	
	
	String etitle=driver.getTitle();
	saresspage s=new saresspage(driver);
	s.verifytitle(driver, etitle);
	
}
}
