package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.engagementpage;
import com.bluestone.pom.ringspage;

public class engagementtest extends basetest 
{
	@Test(priority=2)
	public void engagementmethod()
	{

		engagementpage e=new engagementpage(driver);
		e.clickonimage(driver);
		
	}

}
