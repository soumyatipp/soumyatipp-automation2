package com.shopclues.script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopclues.pom.indianmulticolorsraeespage;
@Listeners(com.shopclues.generic.TestNgListners.class)
public class multicolortest extends basetest
{
	@Test(priority=3)
	public void multicolortstmethod()
	{
		indianmulticolorsraeespage i=new indianmulticolorsraeespage(driver);
		i.selectcolor();
		i.clickonaddtocart();
		i.addedtocart();
		
	}

}
