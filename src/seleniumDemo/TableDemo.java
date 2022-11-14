package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2500);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2500);
		
		WebElement country=driver.findElement(By.xpath("(//Table)[1]//tr[3]//td[3]"));
		System.out.println("Finding element using findElement() "+country.getText());
		
		List <WebElement> row=driver.findElements(By.xpath("//tr"));
		int RowSize=row.size();
		System.out.println("Elements saved "+RowSize);
		String r=row.get(2).getText();
		System.out.println(r);
		
		List <WebElement> col=driver.findElements(By.xpath("//td"));
		int ColSize=col.size();
		System.out.println("Elements saved "+ColSize);
		String data=col.get(5).getText();
		System.out.println(data);
		
		driver.quit();
		
		

	}

}
