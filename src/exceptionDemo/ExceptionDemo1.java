package exceptionDemo;

public class ExceptionDemo1 
{
	int a,b;
	void add(int i,int j) throws DemoException
	{
		int c=i+j;
		if (c<50)
		{
			throw new DemoException("Should not be less than 50");
		}
		else
		{
			System.out.println("Addn is fine.");
		}
	}
	public static void main(String[] args) throws DemoException 
	{
		ExceptionDemo1 obj=new ExceptionDemo1();
		obj.add(2, 32);
	}
}
