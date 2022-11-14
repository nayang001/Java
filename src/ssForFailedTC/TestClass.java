package ssForFailedTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ssForFailedTC.Listener.class)

public class TestClass extends SetUp
{	
	
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		launchBrowser();
	}
	@Test
	public void login() throws InterruptedException
	{
		WebElement id=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6ly']"));
		id.sendKeys("123");
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
