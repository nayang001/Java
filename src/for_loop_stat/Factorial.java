package for_loop_stat;

public class Factorial 
{

	private static void main(String[] args) 
	{
		int fact=1; int a; int num=5;
		for (a=num;a>1;a--)
		{
			fact=fact*a;		
		}
		System.out.println(fact);	
	}

}
