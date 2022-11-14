package itestlisternerDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(itestlisternerDemo.ListenerImplementation.class)

public class TestClass
{
	@Test
	public void test1()
	{
		System.out.println("Test1 method of TestClass");
	}
	
	@Test(timeOut=200)
	public void test2() throws InterruptedException
	{
		Thread.sleep(300);
		System.out.println("Test2 method of TestClass");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3 method of TestClass");
	}
}
