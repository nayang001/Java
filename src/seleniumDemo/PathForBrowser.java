package seleniumDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathForBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "BrowserExe"+File.separator+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2500);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();
		driver=null;
		System.gc();
		
			

	}

}
