package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.shippingdetailspage;

public class shippingdetailstest extends basetest
{
@Test(priority=6)
public void shippingmethod()
{
	shippingdetailspage ship=new shippingdetailspage(driver);
ship.slectcountry(driver);
	ship.enterpincode(driver, "560040");
	ship.enteralternativenumber(driver, "953865784");
	ship.enteraddress(driver, "sggggggggggg");
	ship.entercity(driver, "BANGALORE");
	//ship.slectstate(driver);
	ship.savebuttoncontinuebutton(driver);
}
}
