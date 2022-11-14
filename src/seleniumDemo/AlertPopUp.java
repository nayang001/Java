package seleniumDemo;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(2500);	
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.switchTo().frame("iframeResult");
		WebElement TryB=driver.findElement(By.xpath("//button[text()='Try it']"));
		TryB.click();
		Thread.sleep(2500);
		Alert a=driver.switchTo().alert();
		Thread.sleep(2500);
		String x=a.getText(); System.out.println(x);
		a.accept();Thread.sleep(2500);
		driver.quit();
		

	}

}
