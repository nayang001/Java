package exceptionDemo;

public class ExceptionMessage {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		int d;
		int x;
		try 
		{
			c=a+b;
			System.out.println("Addition "+c);
			d=a/b;
			System.out.println("Divison "+d);
			x=a-b;
			System.out.println("Substraction "+x);
		}
		catch(Exception e)
		{
			b=2;
			d=a/b;
			System.out.println("Divison of catch block"+d);
	//		e.printStackTrace();
	//		System.out.println(e);
	//		System.out.println(e.toString());
	//		System.out.println(e.getMessage());
		}
/* When any exception occurs in any method, that particular method create an object for that particular exception.
 * That objects contains mainly three things which are EXCEPTION NAME, EXCEPTION DESCRIPTION, STACK TRACE (Stack trace is the LINE where exception occurred.)
 * There are 4 methods to print Exception.
 * 
 * printStackTrace(); gives EXCEPTION NAME, EXCEPTION DESCRIPTION, STACK TRACE. (Recommended)
 * 
 * System.out.println(e); gives EXCEPTION NAME, EXCEPTION DESCRIPTION.
 * 
 * System.out.println(e.toString()); gives EXCEPTION NAME, EXCEPTION DESCRIPTION.
 * 
 * System.out.println(e.getMessage()); gives EXCEPTION DESCRIPTION. */
		finally
		{
			b=5;
			d=a/b;
			System.out.println("Divison of finally block"+d);
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		}
		System.out.println("Outside of try n catch n finally block");
		b=2;
		x=a-b;
		System.out.println("Substraction "+x);
	}
}
