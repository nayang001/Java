package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchABroswer 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		Thread.sleep(2500);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	Thread.sleep(2500);
		
		WebElement emailID=driver.findElement(By.id("email"));
		emailID.sendKeys("RG@12345");	Thread.sleep(2500);
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("Abc");	Thread.sleep(2500);
		
		WebElement LoginButton=driver.findElement(By.name("login"));
		LoginButton.click();
		
		WebElement emailID1=driver.findElement(By.xpath("//input[@id='email']"));
		
	}
}
