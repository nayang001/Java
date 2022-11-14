package ssForFailedTC;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends SetUp implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" Failed");
		captureSS(result.getName());
	}
}
