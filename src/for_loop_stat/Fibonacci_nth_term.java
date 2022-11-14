package for_loop_stat;
//PROGRAMM TO FIND FIBONACCI SERIES UPTO num TERM
public class Fibonacci_nth_term 
{

	public static void main(String[] args) 
	{
		int a=0; System.out.print(a+" ");
		int b=1; System.out.print(b+" ");
		int c; int term=12;
		for (int i=1;i<=term;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
		
	}

}
