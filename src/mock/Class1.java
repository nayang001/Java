package mock;

public class Class1 extends ClassA
{
	void demo()
	{
		System.out.println("demo() of Class1");
	}
	
	public static void main(String[] args) 
	{
		Class1 obj=new Class1();
		obj.test();
		obj.demo();
	}
}
