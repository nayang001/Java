package extentReportDemo;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class DemoExtentReport2 
{
	ExtentHtmlReporter Path;
	ExtentReports Report;
	ExtentTest ParentTest;
	ExtentTest ChildTest;
	WebDriver driver;
	WebDriverWait wait;
	static DemoExtentReport2 obj;
	
	public void readyReport()
	{
		Path=new ExtentHtmlReporter("Extent Report"+File.separator+"Report2.html");
		Report=new ExtentReports();
		Report.attachReporter(Path);
	}
	
	public void launchBrowser()
	{
		ParentTest=Report.createTest("Check launchBrowser() working or not","Trial for description");
		ParentTest.log(Status.INFO, "Start the test");
		ChildTest=ParentTest.createNode("Check Browser is opening or not");
		
		System.setProperty("webdriver.chrome.driver", "BrowserExe"+File.separator+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		ChildTest.pass("Browser is opened");
		
		ChildTest=ParentTest.createNode("Check URL is opening or not");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[5]")));
		
		ChildTest.pass("URL is opened");
		ParentTest.pass("launchBrowser() working successfully");
		Report.flush();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void brandingTest() 
	{
		ParentTest=Report.createTest("Verify Branding present or not");
		
		ParentTest.log(Status.INFO, "Start the test");
		
		WebElement branding=driver.findElement(By.xpath("(//img)[1]"));
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		if( ( branding.isDisplayed() ) ==true)
		{
			System.out.println("Company Branding is Displayed");
			ParentTest.pass("Test Passed →Company Branding is Displayed");
			
		}
		else
		{
			System.out.println("Company Branding is not Displayed");
			ParentTest.fail("Test Failed. →Company Branding is not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Report.flush();
	}
	

	public static void main(String[] args)
	{
		obj=new DemoExtentReport2();
		obj.readyReport();
		obj.launchBrowser();
		obj.brandingTest();
		obj.closeBrowser();
		
	}

}
