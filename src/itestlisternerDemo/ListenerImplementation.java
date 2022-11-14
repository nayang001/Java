package itestlisternerDemo;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{
	
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("onTestSuccess-----"+Result.getName());
		System.out.println(Result.getStatus());
	}
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("onTestFailure-------"+Result.getName());
		System.out.println(Result.getStatus());
	}
}
