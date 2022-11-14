package seleniumDemo;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(2500);	
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement TIYbutton=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		TIYbutton.click(); Thread.sleep(2500);
		
		String a=driver.getWindowHandle(); 				System.out.println(a); Thread.sleep(2500);
		
//		Program for Child browser pop up 
		ArrayList<String> arr=new ArrayList<>(driver.getWindowHandles());
		System.out.println(arr); Thread.sleep(2500);
		
		driver.switchTo().window(arr.get(1)); 			System.out.println("Focus Moved to child Browser");
		
//		Program for alert pop up
		
		driver.switchTo().frame("iframeResult");
		WebElement TryB=driver.findElement(By.xpath("//button[text()='Try it']"));
		TryB.click(); Thread.sleep(2500);
		
		Alert b=driver.switchTo().alert();  Thread.sleep(2500);
		String x=b.getText();  Thread.sleep(2500); 		System.out.println(x);
		
		b.accept(); Thread.sleep(2500);					System.out.println("Line 39");
					
		driver.close();Thread.sleep(2500);				System.out.println("Line 41");
		
		driver.switchTo().window(arr.get(0)); 			System.out.println("Line 43");
		TIYbutton.click(); Thread.sleep(2500);			System.out.println("Line 44");
		
		ArrayList<String> brr=new ArrayList<>(driver.getWindowHandles());// If you open web page again than its address will change.
		System.out.println(brr);
		
		driver.switchTo().window(brr.get(1)); 			System.out.println("Line 49");
		driver.close();Thread.sleep(2500);				System.out.println("Line 50");
		
		driver.switchTo().window(brr.get(0)); 			System.out.println("Line 52");
		driver.quit();
	}

}
