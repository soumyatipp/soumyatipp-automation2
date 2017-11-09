package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.selectsizepage;

public class selectsizetest extends basetest
{
@Test(priority=3)
public void buynowmethod()
{
	selectsizepage s1=new selectsizepage(driver);
	s1.selectringbasedonsize(driver);
	s1.buynowbtnclick(driver);

	
}
}
