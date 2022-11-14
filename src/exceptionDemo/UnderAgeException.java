package exceptionDemo;

public class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		super();
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}
