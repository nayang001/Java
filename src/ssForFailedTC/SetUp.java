package ssForFailedTC;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SetUp 
{
	static WebDriver driver;
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

	public String timestamp()
	{
		Date d=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        return dateformat.format(d);
	}

	public void captureSS(String testcasename)
	{ 
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\AT SOFT\\Automated SS\\New folder\\"+testcasename+" "+timestamp()+".jpg");
		try 
		{
			FileHandler.copy(source, dest);
		} 
		catch (IOException e) 
		{
			
		}
		System.out.println("Screenshot captured for "+testcasename);
	}
}
