package array_demo;

import java.util.Arrays;

public class ReverseUsingVar 
{

	public static void main(String[] args) 
	{
		int a[]={1,2,3};
		int l=a.length;int num=l/2;
		int temp;
		
		//To print Original Array using for loop
		System.out.println("Original Array a is ↓");
		for (int j=0;j<l;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
		
		//Program to reverse Original array using Variable/////////////////
		for (int i=0;i<num;i++)
		{
			temp=a[i];
			a[i]=a[l-(i+1)];
			a[l-(i+1)]=temp;
		}
		
		//To print Reverse Array using for loop
		System.out.println("Reverse Array a is ↓ ");
		for (int k=0;k<l;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

	}

}
