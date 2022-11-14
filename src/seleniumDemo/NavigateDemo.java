package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(2500);
				
		driver.manage().window().maximize();//Maximize() method called in Window() and Window() called in manage()
		//This is called as Method chaining.
		Thread.sleep(2500);
		
		driver.navigate().to("https://www.facebook.com"); Thread.sleep(2500);
		
		Dimension d=new Dimension(400, 400);
		driver.manage().window().setSize(d); 	Thread.sleep(2500);
		
		Point p=new Point(0, 680);
		driver.manage().window().setPosition(p);Thread.sleep(2500);
		driver.manage().window().maximize();	Thread.sleep(2500);
		
//		Navigating Browser
		
		driver.navigate().back();		Thread.sleep(2500);
		driver.navigate().forward();	Thread.sleep(2500);
		driver.navigate().refresh();	Thread.sleep(2500);
		String title=driver.getTitle(); System.out.println(title); Thread.sleep(2500);
		String url=driver.getCurrentUrl(); System.out.println(url);
//		driver.close(); //Or we can use driver.quit(); Both methods [close() and quit()] are same. 
						//Close() closes the current tab.
						//Quit() close the browser.
		WebElement emailID=driver.findElement(By.id("email"));
		emailID.sendKeys("RG@12345");
		WebElement Password=driver.findElement(By.id("email"));
		Password.sendKeys("Abc");
		WebElement LoginButton=driver.findElement(By.name("login"));
		LoginButton.click();
	}

}
