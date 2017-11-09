package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.accountdetailspage;

public class accountdetailstest extends basetest 
{
	@Test(priority=5)
	public void account()
	{
		accountdetailspage a=new accountdetailspage(driver);
		a.enteremail(driver,"tippannavar.soumya076@gmail.com");
		a.entername(driver,"soumya tippannavar");
		a.enterphonenumber(driver,"7819081622");
		a.saveandcontinuebutton(driver);
		
	}

}
