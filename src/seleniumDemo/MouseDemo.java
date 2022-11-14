package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(1500);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	Thread.sleep(1500);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']")); 
		Actions a=new Actions(driver);
		a.moveToElement(fashion).perform();   	Thread.sleep(4000);
		
		WebElement womaneth=driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		a.moveToElement(womaneth).build().perform();   Thread.sleep(4000);	
		
		WebElement ethinicdre=driver.findElement(By.xpath("//a[text()='Ethnic Dresses']"));
		ethinicdre.click();
		
	}

}
