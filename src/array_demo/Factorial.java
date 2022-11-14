package array_demo;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int l=a.length; System.out.println("Size of an ARRAY →"+l);
		
		int fact=1;
		for (int i=0;i<l;i++)
		{
			for (int x=a[i];x>1;x--)
			{
				fact=fact*x;	
			}
			System.out.println("Factorial of "+a[i]+" → "+fact);
			fact=1;
		}
	}
}
