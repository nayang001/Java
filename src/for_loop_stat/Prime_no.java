package for_loop_stat;

import java.util.Scanner;

// Program to find all divisor of a number
public class Prime_no 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
		
		int b=sc.nextInt(); int a,flag=0;
		
		for (a=2;a<b;a++)
		{
			if(b%a==0)
			{
				flag++;
			}			
		}
		
		if (flag==0)
		{
			System.out.println("Given value is Prime Value.");
		}
		else
		{
			System.out.println("Giver value is Composite Value.");
		}
	}
}
