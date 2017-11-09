package gen;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class lib
{
	public static String getcellvalue(String xlpath,String sheet,int r,int c)
	{
		String val="";
		try
		{
		
			Workbook wb=WorkbookFactory.create(new FileInputStream(xlpath));
			
			val=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			System.out.println(val);
		}
		catch(Exception e)
		{
			
		}
		return val;
		
	}
public static String getproperty(String path,String key)
{
	String value="";
	try
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		value=p.getProperty(key);
		
	}
	catch(Exception e)
	{
		
	}
	return value;
}
}
