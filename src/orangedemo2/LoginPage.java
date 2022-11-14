package orangedemo2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public interface LoginPage 
{
	void loginPageText(WebDriver driver);
	void logIn(WebDriver driver) throws InterruptedException;
	void forgetPassword(WebDriver driver) throws IOException;

}
