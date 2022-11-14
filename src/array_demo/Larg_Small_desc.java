package array_demo;

import java.util.Arrays;

public class Larg_Small_desc 
{

	public static void main(String[] args) 
	{
		int a[]= {1,4,2,5,3,6,1,9}; int l=a.length;
		int temp=0;
		for (int i=0;i<l;i++)
		{
			for (int j=0;j<l;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Smallest number is → "+a[l-1]);
		System.out.println("Biggest number is → "+a[0]);
		System.out.println("Array in descending order ↓");
		for (int j=0;j<l;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
