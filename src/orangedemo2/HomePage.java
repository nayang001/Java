package orangedemo2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public interface HomePage 
{
	void leftPanel(WebDriver driver) throws IOException, InterruptedException;
	void topPanel(WebDriver driver);
}
