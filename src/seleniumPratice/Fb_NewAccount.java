package seleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_NewAccount 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2500);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	Thread.sleep(2500);
		
		WebElement CreateNA=driver.findElement(By.xpath("(//a[@role='button'])[2]"));  //a[text()='Create New Account']
		CreateNA.click(); Thread.sleep(2500);
		
		WebElement FirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));  //input[@name='firstname']
		FirstName.sendKeys("Aegon"); Thread.sleep(2500);
		
		WebElement LastName=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		LastName.sendKeys("Targaryen"); Thread.sleep(2500);
		
		WebElement Contact=driver.findElement(By.xpath("(//input[@type='text'])[4]"));    //div[text()='Mobile number or email address']
		Contact.sendKeys("Dracarys@gmail.com"); Thread.sleep(2500);
		
		WebElement ReContact=driver.findElement(By.xpath("(//input[@type='text'])[5]"));    //div[text()='Re-enter email address']
		ReContact.sendKeys("Dracarys@gmail.com"); Thread.sleep(2500);
		
		WebElement NPass=driver.findElement(By.xpath("(//input[@type='password'])[2]"));    //div[text()='New password']
		NPass.sendKeys("ABC@123456"); Thread.sleep(2500);
		
		WebElement BD=driver.findElement(By.xpath("//select[@name='birthday_day']")); 
		BD.sendKeys("999"); Thread.sleep(2500);
		
		WebElement BM=driver.findElement(By.xpath("//select[@name='birthday_month']")); 
		BM.sendKeys("Sep"); Thread.sleep(2500);
		
		WebElement BY=driver.findElement(By.xpath("//select[@name='birthday_year']")); 
		BY.sendKeys("1990"); Thread.sleep(2500);
		
		WebElement Gender=driver.findElement(By.xpath("//label[text()='Male']")); 
		Gender.click(); Thread.sleep(2500);
		
		WebElement SignUp=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")); 
		SignUp.click(); Thread.sleep(2500);
	}

}
