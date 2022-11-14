package seleniumDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "E:\\AT SOFT\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

	}

}
