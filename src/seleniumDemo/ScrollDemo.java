package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/howto/howto_js_popup.asp");
		Thread.sleep(2500);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2500);
		j.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(2500);
		// (//a[text()='Try it Yourself »'])[2]
		
		WebElement trybt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		j.executeScript("arguments[0].scrollIntoView(true);",trybt);
		Thread.sleep(2500);
		
	}

}
