package for_loop_stat;

import java.util.Scanner;

public class Atm 
{

	public static void main(String[] args) 
	{
		int a;
		for(a=1000; a>=100; a-=100)
		{
			System.out.println("Remaining amount "+a);
		}
		if (a<100)
		{
			System.out.println("Insufficient balance ");
		}
		
	}

}
