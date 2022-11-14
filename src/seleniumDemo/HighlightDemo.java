package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		Thread.sleep(5000);
		
		WebElement branding=driver.findElement(By.xpath("//img[@alt='Facebook']"));//(//img)[1]
		System.out.println("Branding present →"+branding.isDisplayed());
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
//		j.executeScript("arguments[0].style.background='yellow'", branding);//Working
//		Thread.sleep(5000);
		
//		j.executeScript("arguments[0].setAttribute('style','border: solid 4px red')", branding); //Working
//		Thread.sleep(5000);
		
		j.executeScript("arguments[0].setAttribute('style','background: yellow')", branding);//Working
		Thread.sleep(5000);
		j.executeScript("arguments[0].removeAttribute('style','background: yellow')", branding);
	}

}
