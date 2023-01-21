package array_demo;

import java.util.Arrays;

public class Demo_array2d 
{

	public static void main(String[] args) 
	{
		int a[][]= {{4,5,6},{1,2,3}}; int x=a.length;  System.out.println(x);
		
		for (int i=0;i<x;i++)
		{
			for (int j=0;j<x;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println(); 
		
		System.out.println(Arrays.deepToString(a));
	/////////////////////////////////////////////////////
		System.out.println();
		
		int b[]= {2,5,9,4,6,3}; int y=b.length;
		
		for (int k=0;k<y;k++)
		{
			System.out.print(" "+b[k]);
		}
		System.out.println(); System.out.println();
		
		System.out.println(Arrays.toString(b));
		
		

	}

}
