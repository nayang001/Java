package array_demo;

import java.util.Arrays;

public class Larg_Small_asce 
{

	public static void main(String[] args) 
	{
		int a[]= {4,2,5,3,6,1,9}; int l=a.length;
		int temp=0;
		for (int i=0;i<l;i++)
		{
			for (int j=i+1;j<l;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Biggest number is → "+a[l-1]);
		System.out.println("Smallest number is → "+a[0]);
		System.out.println("Array in ascending order ↓");
		for (int j=0;j<l;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
