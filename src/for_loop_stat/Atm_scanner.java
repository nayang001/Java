package for_loop_stat;

import java.util.Scanner;

public class Atm_scanner 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an amount "); int a;
		
		for(a=sc.nextInt(); a>=100; a-=100)
		{
			System.out.println("Remaining amount "+a);
		}
		if (a<100)
		{
			System.out.println("Insufficient balance ");
		}

	}

}
