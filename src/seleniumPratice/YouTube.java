package seleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(1500);
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");	Thread.sleep(1500);
		
		WebElement Search=driver.findElement(By.xpath("//input[@id='search']"));
		Search.sendKeys("How to write automation script");  Thread.sleep(1500);
		
		WebElement Searchclick=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		Searchclick.click(); Thread.sleep(1500);
		
		WebElement SignIn=driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[2]"));
		SignIn.click(); Thread.sleep(1500);
		
		WebElement emailID=driver.findElement(By.xpath("//input[@id='identifierId']"));
		emailID.sendKeys("BVC@gmail.com");	Thread.sleep(2500);
		
		WebElement Next=driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click(); Thread.sleep(1500);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("ABC");	Thread.sleep(2500);
		
//		driver.close();
		
	}

}
