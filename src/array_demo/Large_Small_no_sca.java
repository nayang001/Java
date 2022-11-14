package array_demo;

import java.util.Scanner;

public class Large_Small_no_sca 
{
	public static int[] arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an ARRAY → ");
		int num=sc.nextInt();
		System.out.println("Size of an ARRAY → "+num);
		
		int a[]=new int[num];
		System.out.println("Enter the values for array");
		for (int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int j=0;j<num;j++)
		{
			System.out.print(a[j]+" ");
		}
		sc.close();
		return a;		
	}

	public static void main(String[] args) 
	{
		
		int a[]=Large_Small_no_sca.arr();
		System.out.println();
		int l=a.length;
		int flag=0; int hlag=0;
		for (int i=0;i<l;i++)
		{
			for (int j=0;j<l;j++)
			{	
				if (a[i]>=a[j])
				{
					flag++;
					if (flag==l)
					{
						System.out.println("Biggest no is →"+a[i]);
					}	
				}
				if (a[i]<=a[j])
				{	
					hlag++;
					if (hlag==l)
					{
						System.out.println("Smallest no is →"+a[i]);
					}
				}
			}
			flag=0; hlag=0;
		}

	}

}
