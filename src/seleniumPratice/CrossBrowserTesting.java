package seleniumPratice;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
		
	@BeforeTest
	@Parameters(value="Browser")
	public void launchBrowser(String browsername) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "BrowserExe"+File.separator+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
		}
		
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "BrowserExe"+File.separator+"msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
		}
		else if(browsername.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "BrowserExe"+File.separator+"geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
		}	
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Ha Ha Ha");
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		driver=null;
		System.gc();
	}
	
	
}
