package mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDownQue 
{
	public void captureSS(WebDriver driver,String Name) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File ("E:\\AT SOFT\\Automated SS\\MOCK PROGRAMM\\"+Name+"_Image.jpg");
		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(1500);
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");	Thread.sleep(1500);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		
		DropDownQue obj=new DropDownQue();
		
		
		WebElement List=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));  
		List.click();
		obj.captureSS(driver, "Drop_Down");
		
		
		Select d=new Select(List);
		d.selectByVisibleText("Option3");
		obj.captureSS(driver, "Drop_Down_Selected_option");
		

	}

}
