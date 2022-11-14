package downCast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX extends Main
{

	public static void main(String[] args) 
	{
		A obja= new Main();// Upcasting. 
		
		B objb= (B)obja;	//Down casting.
		
		objb.animal();
		int x=objb.sum();
		System.out.println(x);
	}

}
