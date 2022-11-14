package demoInterface;

public class ImplementationClass implements Interface_A
{
	int a=45;
	int b=12;
	public void add()
	{
		int c=this.a+this.b;
		System.out.println(c);
		System.out.println();
	}
	
	public void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	
	public void div()
	{
		int c=a/b;
		System.out.println(c);
	}

	public void mul()
	{
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		ImplementationClass obj=new ImplementationClass();
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();	
	}

}
