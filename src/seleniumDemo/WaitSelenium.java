package seleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSelenium 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
//		IMPLICITE WAIT
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//		EXPLICITE WAIT
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		SPECIFIC CONDITION TO APLLY
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		
//		Fluent Wait
//		FluentWait<WebDriver> wait1=new FluentWait<WebDriver>
	}

}
