package exceptionDemo;

public class ExceptionDescriptionDemo 
{

	public static void main(String[] args) 
	{
		String a="Exception Description";
		ArithmeticException e=new ArithmeticException(a);
		e.printStackTrace();
/* 
 * String a is nothing but exception description that will be printed in console as explanation or description for Exception.
 */
	}

}
