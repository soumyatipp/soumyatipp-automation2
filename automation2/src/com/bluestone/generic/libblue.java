package com.bluestone.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class libblue 
{
	public static String getproperty(String path,String key)
	{
		String val="";
		try
		{
			Properties p=new Properties();
			FileInputStream file=new FileInputStream(path);
			p.load(file);
			val=p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return val;
	}

}
