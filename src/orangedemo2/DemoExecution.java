package orangedemo2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoExecution extends ImplementMain
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement Login=driver.findElement(By.xpath("//input[@name='username']"));
		Login.sendKeys("admin");Thread.sleep(3000);
		WebElement Pass=driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("admin123");Thread.sleep(3000);
		WebElement Loginbt=driver.findElement(By.xpath("//button[text()=' Login ']"));
		Loginbt.submit();Thread.sleep(3000);
		
//		//Admin module 
		WebElement Admin=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
		Admin.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

}
