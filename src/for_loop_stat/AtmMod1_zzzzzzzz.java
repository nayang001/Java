package for_loop_stat;

import java.util.Scanner;

public class AtmMod1_zzzzzzzz 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an amount "); int a=sc.nextInt();
		
		if (a==100)
		{
			for (a=sc.nextInt();a>=100;a-=100)
			{
				System.out.println("Remaining amount "+a);
			}
		}
		if (a==500)
		{
			for (a=sc.nextInt();a>=100;a-=500)
			{
				System.out.println("Remaining amount "+a);
			}
		}
		if (a==1000)
		{
			for (a=sc.nextInt();a>=100;a-=1000)
			{
				System.out.println("Remaining amount "+a);
			}
		}
		if (a==2000)
		{
			for (a=sc.nextInt();a>=100;a-=2000)
			{
				System.out.println("Remaining amount "+a);
			}
		}
		
		

	}

}
