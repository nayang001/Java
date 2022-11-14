package array_demo;
import java.util.Arrays; 
public class Demo_add 
{

	public static void main(String[] args) 
	{
		int a[]= {4,52,45,86,31,46,75,96};//Array Initialization and Declaration
		int b[]=new int[4];//Array declaration
		b[0]=a[0]+a[1];
		b[1]=a[2]+a[3];
		b[2]=a[4]+a[5];          //Array b initialization
		b[3]=a[6]+a[7];		
		
		int x=a.length; int y=b.length; //Finding Size of array using KEYWORD length
		
		for (int i=0;i<x;i++)           //Printing a[] using for loop
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for (int j=0;j<y;j++)
		{
			System.out.print(" "+b[j]);  //Printing b[] using for loop
		}
		System.out.println();
		System.out.println(Arrays.toString(a));//Printing a[]
		System.out.println(Arrays.toString(b));//Printing Add of a[]
	}

}
