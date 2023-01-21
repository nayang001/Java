package seleniumDemo;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSearchSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.open()"); 		Thread.sleep(1500);
		((JavascriptExecutor)driver).executeScript("window.open()");		Thread.sleep(1500);
		((JavascriptExecutor)driver).executeScript("window.open()");		Thread.sleep(1500);
		ArrayList<String> arr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arr.get(3));
		
		driver.get("https://www.youtube.com/channel/UCgWFpG4lrmobPloXarqWJDw");
		
	}
}	
