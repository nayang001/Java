package itestlisternerDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Unrelated
{
	
	
	public static String timestamp()
	{
		Date d=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        return dateformat.format(d);
	}
	
	public static void captureSS(WebDriver driver)
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\AT SOFT\\Automated SS\\New folder\\"+timestamp()+".jpg");
		try 
		{
			FileHandler.copy(source, dest);
		} 
		catch (IOException e) 
		{
			
		}
		System.out.println("Screenshot captured");
	}
}
