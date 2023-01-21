package for_loop_stat;
// PROGRAMM TO FIND FIBONACCI SERIES UPTO num VALUE
public class Fibonacci1 
{

	public static void main(String[] args) 
	{
		int a=0; int b=1; int c;  int num=1000;
		
		//System.out.print(" "+a);
		
		for (c=0; c<=num; c+=0)
		{
			System.out.print(" "+c);
			c=a+b;
			a=b;
			b=c;
							
		}
		System.out.println();
		
	}

}
