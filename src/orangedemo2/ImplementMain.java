package orangedemo2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplementMain implements LoginPage, HomePage
{
	static ImplementMain cap=new ImplementMain();
		
	public void captureSS(WebDriver driver,String Name) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File ("E:\\AT SOFT\\Automated SS\\OrangeHRMDemo2\\"+Name+".jpg");
		FileHandler.copy(source, dest);
	}
	
	public void loginPageText(WebDriver driver)
	{
//		//LOGIN PAGE Company_branding
		
		WebElement companybrand=driver.findElement(By.xpath("(//img)[1]"));
    	boolean a=companybrand.isDisplayed();
    	if (a==true)
    	{
    		System.out.println("Comapny branding is displayed.");
    	}
    	else
    	{
    		System.out.println("ERROR=> Comapny branding is not displayed.");
    	}
    	
    	
//    	//LOGIN Page Login_text
    	
    	WebElement LoginText=driver.findElement(By.xpath("//h5[text()='Login']"));
    	Boolean b=LoginText.isDisplayed();
    	if (b==true)
    	{
    		System.out.println("Login text is displayed.");
    	}
    	else
    	{
    		System.out.println("ERROR=> Login text is not displayed.");
    	}
    	
 //   	//LOGIN Page Username : Admin 
    	//			 Password : admin123
    	
    	WebElement credUN=driver.findElement(By.xpath("//p[text()='Username : Admin']"));
    	
    	WebElement credPass=driver.findElement(By.xpath("//p[text()='Password : admin123']"));
    	
    	boolean x=credUN.isDisplayed(); boolean y=credPass.isDisplayed();
    	
    	if (x==true && y==true)
    	{
    		System.out.println("'Username : Admin' and 'Password : admin123' displayed.");
    	}
    	else
    	{
    		System.out.println("ERROR=>'Username : Admin' and 'Password : admin123' both should be displayed.");
    	}
    	
//    	// OrangeHRM LOGO
    	
    	WebElement Logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']"));
    	if (Logo.isDisplayed()==true)
    	{
    		System.out.println("Logo is displayed.");
    	}
    	else
    	{
    		System.out.println("ERROR=> Logo is not displayed");
    	}
    	
//    	// Orange HRM Rights 'OrangeHRM OS 5.1'
    	
    	if (driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.1']")).isDisplayed()==true)
    	{
    		System.out.println("'OrangeHRM OS 5.1' is Displayed");
    	}
    	else
    	{
    		System.out.println("ERROR=>'OrangeHRM OS 5.1' is not Displayed");
    	}
    	
//    	// Orange HRM Rights '© 2005 - 2022' 
    	
    	if(driver.findElement(By.xpath("//p[text()='© 2005 - 2022 ']")).isDisplayed()==true)
    	{
    		System.out.println("'© 2005 - 2022' is Dispalyed.");
    	}
    	else
    	{
    		System.out.println("ERROR=>'© 2005 - 2022' is not Dispalyed.");
    	}
    	
//  	//Orange HRM Rights 'OrangeHRM, Inc'  
    	
    	if (driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).isDisplayed()==true)
    	{
    		System.out.println("'OrangeHRM, Inc' is Dispalyed.");
    	}
    	else
    	{
    		System.out.println("ERROR=>'OrangeHRM, Inc' is not Dispalyed.");
    	}
    	
 //   	//Orange HRM Rights 'All rights reserved.'  
    	
    	if (driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).isDisplayed()==true)
    	{
    		System.out.println("'OrangeHRM, Inc' is Dispalyed.");
    	}
    	else
    	{
    		System.out.println("ERROR=>'OrangeHRM, Inc' is not Dispalyed.");
    	}
	}
	
	public void forgetPassword(WebDriver driver) throws IOException
	{
		WebElement FP=driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
		Boolean a=FP.isDisplayed();
//		//Login page Forgot password Text	
		if(a==true)
		{
			System.out.println("Forgot Password is Dislayed.");
		}
		else
		{
			System.out.println("ERROR=> Forgot Password is not Dislayed.");
		}
		
//		//Login page Forgot password Function
		
		FP.click();
	}
	
	public void logIn(WebDriver driver) throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//input[@name='username']"));
		Login.sendKeys("admin");Thread.sleep(3000);
		WebElement Pass=driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("admin123");Thread.sleep(3000);
		WebElement Loginbt=driver.findElement(By.xpath("//button[text()=' Login ']"));
		Loginbt.submit();Thread.sleep(3000);
		
	}
	
	public void leftPanel(WebDriver driver) throws IOException, InterruptedException
	{
//		//Orange HRM logo
		
		WebElement LOGO=driver.findElement(By.xpath("//img[@alt='client brand banner']"));
		Boolean a=LOGO.isDisplayed();
		if(a==true)
		{
			System.out.println("Orange HRM logo is Displayed");
		}
		else
		{
			System.out.println("ERROR=> Orange HRM logo is Displayed");
		}
		
//		//Search Module  
		WebElement Search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Search.sendKeys("Admin");
		cap.captureSS(driver, "Search_Successfull"); Thread.sleep(2000);
		Search.sendKeys("");
		
//		//Admin module 
		WebElement Admin=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
		Admin.click();
		cap.captureSS(driver, "Admin_page");		Thread.sleep(2000);
		driver.navigate().back();
		
//		//PIM module 
		WebElement PIM=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
		PIM.click();
		cap.captureSS(driver, "PIM_page");			Thread.sleep(2000);
		driver.navigate().back();	
		
//		//Leave module 
		WebElement Leave=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]"));
		Leave.click();
		cap.captureSS(driver, "Leave_page");		Thread.sleep(2000);
		driver.navigate().back();	
		
//		//Time module 
		WebElement Time=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]"));
		Time.click();
		cap.captureSS(driver, "Time_page");			Thread.sleep(2000);
		driver.navigate().back();
		
//		//Recruitment module 
		WebElement Recruitment=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]"));
		Recruitment.click();
		cap.captureSS(driver, "Recruitment_page");	Thread.sleep(2000);
		driver.navigate().back();
		
//		//MyInfo module 
		WebElement MyInfo=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]"));
		MyInfo.click();
		cap.captureSS(driver, "MyInfo_page");		Thread.sleep(2000);
		driver.navigate().back();
		
//		//Performance module 
		WebElement Performance=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[7]"));
		Performance.click();
		cap.captureSS(driver, "Performance_page");	Thread.sleep(2000);
		driver.navigate().back();	
		
//		//Dashboard module 
		WebElement Dashboard=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]"));
		Dashboard.click();
		cap.captureSS(driver, "Dashboard_page");	Thread.sleep(2000);
		driver.navigate().back();
		
//		//Directory module 
		WebElement Directory=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]"));
		Directory.click();
		cap.captureSS(driver, "Directory_page");	Thread.sleep(2000);
		driver.navigate().back();
		
//		//Maintainance module 
		WebElement Maintainance=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[10]"));
		Maintainance.click();
		cap.captureSS(driver, "Maintainance_page");	Thread.sleep(2000);
		driver.navigate().back();	
		
//		//Buzz module 
		WebElement Buzz=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]"));
		Buzz.click();
		cap.captureSS(driver, "Buzz_page");			Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	public void topPanel(WebDriver driver)
	{}
	
	
}
