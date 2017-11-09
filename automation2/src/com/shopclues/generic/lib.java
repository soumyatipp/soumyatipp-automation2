package com.shopclues.generic;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Properties;

public class lib
{
	public static String getproperty(String path,String key)
	{
		String value="";
		try
		{
			Properties p=new Properties();
			 p.load(new FileInputStream(path));
			value= p.getProperty(key);
			
		}
		catch(Exception e)
		{
			
		}
		return value;
	}

}
