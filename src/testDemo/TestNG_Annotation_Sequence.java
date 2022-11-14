package testDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation_Sequence 
{
	@Test
	public void Test1()
	{
		System.out.println("Test1 Mmethod.");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Test Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Test Method");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class.");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	

}
