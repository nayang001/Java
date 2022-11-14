package array_demo;

public class Even_Odd 
{

	public static void main(String[] args) 
	{
		int[] a= {5,2,4,14,19,45,48,63,67,64,58,52,102,106,108,103,1106};
		int x=a.length; System.out.println("Size of a[] is "+x);
		System.out.println();
		for (int i=0;i<x;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is EVEN");
			}
			else
			{
				System.out.println(a[i]+" is ODD");
			}
		}
		

	}

}
