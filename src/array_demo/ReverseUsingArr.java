package array_demo;

import java.util.Arrays;

public class ReverseUsingArr 
{

	public static void main(String[] args) 
	{
		int a[]={4,5,8,9,6,2,1};
		int l=a.length;
		int b[]=new int[l];
		
		//Program to reverse array
		System.out.println("Original Array of a is ↓");
		for (int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");//Printing a[]
			b[l-(i+1)]=a[i];
		}
		System.out.println();
		//To print reverse array using for loop
		System.out.println("Reverse of the Array a is ↓");
		for (int j=0;j<l;j++)
		{
			System.out.print(b[j]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(b));
	}

}
