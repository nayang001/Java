package array_demo;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_Sca 
{
	public static int[] arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int num=sc.nextInt(); // Size of array
			
		int a[]=new int[num];
		System.out.println("Enter the values ");
		for (int i=0;i<num;i++)//Value for array loop
		{
			a[i]=sc.nextInt();
		}
		for (int j=0;j<num;j++)//Printing array loop
		{
			System.out.print(a[j]+" ");
		}
		sc.close();
		System.out.println();
		System.out.println(Arrays.toString(a));
		
		return a;		
	}
	public static void main(String[] args) 
	{
		int[] a=Prime_Sca.arr();
		int l=a.length;
		int flag=0;
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
			if (flag==0)
			{
				System.out.println(a[i]+" is Prime");
			}
			flag=0;
		}
		
		
		
	}

}
