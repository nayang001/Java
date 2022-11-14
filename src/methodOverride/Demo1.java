package methodOverride;

public class Demo1 
{
	protected void test()
	{
		System.out.println("test() of Demo1");
	}
	
	public void test1()
	{
		System.out.println("test1() of Demo1");
	}

	public static void main(String[] args) 
	{
		Demo1 obj=new Demo1();
		obj.test();
		obj.test1();

	}

}
