package itestlisternerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(itestlisternerDemo.ListenerImplementation.class)

public class ListenerAttempt1 
{
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	@Test
	public void login() throws InterruptedException
	{
		WebElement id=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6ly']"));
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
