package orangehrmdemo1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import orangedemo2.ImplementMain;

public class MainExecution 
{
	
	public void captureSS(WebDriver driver,String Name) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File ("E:\\AT SOFT\\Automated SS\\OrangeHRMDemo1\\"+Name+".jpg");
		FileHandler.copy(source, dest);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
    	MainExecution obj=new MainExecution();

    	
//		//LOGIN PAGE Company_branding
		
		WebElement companybrand=driver.findElement(By.xpath("//img[@alt='company-branding']"));
    	Boolean a=companybrand.isDisplayed();
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
    	
    	Thread.sleep(5000);
    	obj.captureSS(driver, "Login_page_text");
    	
//		//Login page Forgot password    
    	WebElement FP=driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
		Boolean i=FP.isDisplayed();
		
		if(i==true)
		{
			System.out.println("Forgot Password is Dislayed.");
			FP.click();
			
			obj.captureSS(driver, "Forgot_Password_page");
			System.out.println("Related Page for Forgot Password is Opening.");
			driver.navigate().back();	
		}
		else
		{
			System.out.println("ERROR=> Forgot Password is not Dislayed.");
		}

//		//Login Function
		WebElement Login=driver.findElement(By.xpath("//input[@name='username']"));
		Login.sendKeys("admin");Thread.sleep(3000);
		WebElement Pass=driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("admin123");Thread.sleep(3000);
		WebElement Loginbt=driver.findElement(By.xpath("//button[text()=' Login ']"));
		Loginbt.submit();Thread.sleep(3000);
		
		obj.captureSS(driver, "Login_Successful");
		
	}

}
