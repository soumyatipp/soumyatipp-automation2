package com.shopclues.script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopclues.pom.cartpage;
import com.shopclues.pom.saresspage;
@Listeners(com.shopclues.generic.TestNgListners.class)
public class sareestest extends basetest
{
	@Test(priority=2)
	public void sareesmethod()
	{
		saresspage s=new saresspage(driver);
		//s.scrooldowntosarees(driver);
		  s.scrooldowntosarees(driver);
		  s.clickonsareesimage(driver);
		
		cartpage c=new cartpage(driver);
		String title=driver.getTitle();
		c.addedtocartitems(driver, title);
	}

}
