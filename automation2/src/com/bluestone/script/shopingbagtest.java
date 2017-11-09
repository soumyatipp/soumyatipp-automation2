package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.shopingbagpage;

public class shopingbagtest extends basetest
{
	@Test(priority=4)
	public void shopingmethod()
	{
		shopingbagpage shop=new shopingbagpage(driver);
		shop.verifytheamount(driver, "61,398");
		shop.checkitemaddedtocart(driver, 01);
		shop.clickonplaceorder(driver);
		
	
	}

}
