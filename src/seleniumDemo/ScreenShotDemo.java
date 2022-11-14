package seleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\AT SOFT\\Automated SS\\fblogin.jpg");
		FileHandler.copy(source, dest);
		

	}

}
