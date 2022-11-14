package extentReportDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoExtentReport1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ExtentHtmlReporter Report=new ExtentHtmlReporter("./test-output/ABCD.html");		//Path
		ExtentReports Extent=new ExtentReports();											//Page
		Extent.attachReporter(Report);														//Saving Page on Path
		ExtentTest Test=Extent.createTest("Verify the OrangeHrm Branding present or not");	//Printing on Page
		
		System.setProperty("webdriver.chrome.driver", "BrowserExe"+File.separator+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		
		Test.log(Status.INFO, "Start the test");
		
	//	System.out.println(Status.INFO);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		Test.pass("Link opened Successfully");
		
/*		WebElement companybrand=driver.findElement(By.xpath("//img[@alt='company-branding']"));
    	Boolean a=companybrand.isDisplayed();
    	if (a==true)
    	{
    		System.out.println("Comapny branding is displayed.");
    	}
    	else
    	{
    		System.out.println("ERROR=> Comapny branding is not displayed.");
    	}
    	*/
    	Thread.sleep(3000);
    	
    	Test.pass("Test Completed");
    	
    	driver.quit();
    	
    	Test.pass("Browser closed.");
//   	Test.fail("Browser not closed");
    	Extent.flush();
    	
    	driver=null;
    	System.gc();
	}

}
