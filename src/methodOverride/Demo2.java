package methodOverride;

public class Demo2 extends Demo1
{
	protected void test()
	{
		System.out.println("test() of Demo2");
	}
	public void test1()
	{
		System.out.println("test1() of Demo2");
	}

	public static void main(String[] args) 
	{
		Demo2 obj=new Demo2();
		obj.test();
		obj.test1();
		Demo1 obj1= new Demo1();
		obj1.test();
		obj1.test1();

	}

}
