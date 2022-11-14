package for_loop_stat;

import java.util.Scanner;

public class Prime1_zzzzzzzzzzzzz 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
		
		int b=sc.nextInt(); int a,flag=1;
		
		if( b%2==0 )
		{
			System.out.println(b+" is a Composite");
		}
		else
		{
			for (a=b;a>0;a-=2)
			{
				if (b%a ==0)
				{
					System.out.println(b+" is Prime.");
					flag=1;
					break;
				}
			}
		}

	}

}
