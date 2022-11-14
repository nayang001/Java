package dowhile_loop_stat;

import java.util.Scanner;

public class Primeno 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any value");  
		int a=sc.nextInt(); 
		System.out.println("Given value is "+a);
		
		int flag=0; int b=2;
		do
		{
			if (a%b==0)
			{
				flag++;
			}
			b++;
		}
		while (b<a);

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
