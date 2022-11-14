package packge;

import java.util.Scanner;
public class Demo_of_scanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A and B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Value of A is "+a);
		System.out.println("Value of B is "+b);
		if(a>b)
		{
			System.out.println(a+" is bigger");
		}
		else
		{
			System.out.println(b+" is bigger");
		}
		int c=a+b;
		System.out.println("Addition is "+c);
		if (c>0)
		{
			System.out.println(c*-2);
		}
		else
		{
			System.out.println(c*-2);
		}
	}

}