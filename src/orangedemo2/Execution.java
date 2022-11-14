package orangedemo2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution extends ImplementMain
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AT SOFT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	
		cap.loginPageText(driver);						Thread.sleep(3000);System.out.println("---------loginPageText executed");
		cap.captureSS(driver,"Login_Page_Text");		Thread.sleep(3000);System.out.println("---------captureSS executed");
		cap.forgetPassword(driver);						Thread.sleep(3000);System.out.println("---------forgetPassword executed");
		cap.captureSS(driver, "Forgot_Password_Page");	Thread.sleep(3000);System.out.println("---------captureSS executed");
		driver.navigate().back();						Thread.sleep(3000);
		cap.logIn(driver);								Thread.sleep(3000);System.out.println("---------logIn executed");
		cap.captureSS(driver, "LogIn_Successful");		Thread.sleep(3000);System.out.println("---------captureSS executed");
		cap.leftPanel(driver);							Thread.sleep(3000);System.out.println("---------leftPanel executed");
	}

}
