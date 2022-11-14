package exceptionDemo;

public class Voting 
{

	public static void main(String[] args) throws UnderAgeException 
	{
		int age=16;
		if (age<18)
		{
			throw new UnderAgeException();
		}
		System.out.println();
		try
		{
			if (age<18)
			{
				throw new UnderAgeException();
			}
			else
			{
				System.out.println("You can vote");
			}
		}
		catch (UnderAgeException e)
		{
			e.printStackTrace();
		}
	}

}
