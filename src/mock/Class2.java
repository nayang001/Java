package mock;

public class Class2 extends ClassA
{
	void demo2()
	{
		System.out.println("demo2() of Class2");
	}
	
	public static void main(String[] args) 
	{
		Class2 obj=new Class2();
		obj.test();
		obj.demo2();
	}
}
