package array_demo;

import java.util.Arrays;

public class Calling_array_in_main 
{
	public static int[] arr()
	{
		int a[]= {1,2,3,4};
		return a;
	}

	public static void main(String[] args) 
	{
		Calling_array_in_main.arr();
		int z[]=arr();
		System.out.println(Arrays.toString(z));

	}

}
