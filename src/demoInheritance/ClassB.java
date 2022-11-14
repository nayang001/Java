package demoInheritance;

public class ClassB extends ClassA
{
	static void c()
	{
		System.out.println("c od ClassB");
	}
	
	static void d()
	{
		System.out.println("d of ClassB");
	}
	public static void main(String[] args) 
	{
		ClassB.a();
	}

}
