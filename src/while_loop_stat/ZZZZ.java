package while_loop_stat;

import java.util.Arrays;

public class ZZZZ 
{
	protected void printArray(int a[])
	{
		int l=a.length;
		
		//Printing Array using for loop
		System.out.println("Array of a is using for loop ↓");
		for (int x=0;x<l;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		
		//Printing array using method in Java
		System.out.println("Array of a using method in Java");
		System.out.println(Arrays.toString(a)); System.out.println();	
	}

	public  void prime(int a[])
	{
		int l=a.length;
			
	// Prime program 	
		int flag=0;
		System.out.println("Prime numbers are as follows ↓ ");
		for (int i=0;i<l;i++)
		{
			for (int j=2;j<a[i];j++)
			{
				if (a[i]%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(a[i]+" ");
			}
			flag=0;	
		}
		System.out.println();System.out.println();
	}

	public static void Asc(int a[])
	{
		int l=a.length;
		
		// Program for ascending
		int temp;
		for (int i=0;i<l;i++)
		{
			for (int j=(i+1);j<l;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array in ascending order ↓");
		for (int x=0;x<l;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("Biggest number = "+a[l-1]);
		System.out.println("Smallest number = "+a[0]);
		System.out.println();
	}

	public  void factorial(int a[])
	{
		int l=a.length;
		
		// Program for factorial
		int fact=1;
		for (int i=0;i<l;i++)
		{
			for (int j=a[i];j>1;j--)
			{
				fact=j*fact;	
			}
			System.out.println("Factorial of "+a[i]+" is "+fact);
			fact=1;
		}	
	}
	
}
