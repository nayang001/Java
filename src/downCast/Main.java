package downCast;

public class Main implements A,B
{
	public void animal() 
	{
		System.out.println("Animal");
	}

	public void Bird() 
	{
		System.out.println("Bird");
	}

	public int sum()
	{
		int a=12;int b=15;
		int c=a+b;
		return c;
	}
}
