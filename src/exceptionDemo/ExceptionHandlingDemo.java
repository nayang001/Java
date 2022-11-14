package exceptionDemo;

public class ExceptionHandlingDemo 
{

	public static void main(String[] args)    
	{
		int a=50;
		int b=0;
		int c;
		try
		{
			c=a/b;
	
		}
		catch(ArithmeticException e) //e=ref variable of ArithmeticException class
		{
			e.printStackTrace();
			b=5;
			c=a/b;
			System.err.println(e);
		}
		finally
		{
			System.out.println("Finally Code OR Independent code");
		}
		System.out.println("Divison is "+c);
		
		
	}

}
