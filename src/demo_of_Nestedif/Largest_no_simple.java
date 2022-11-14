package demo_of_Nestedif;

import java.util.Scanner;

public class Largest_no_simple 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is bigger. "+a);
			}
			else
			{
				System.out.println("C is bigger. "+c);
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("B is bigger. "+b);
			}
			else
			{
				System.out.println("C is bigger. "+c);
			}
		}
		
	}

}