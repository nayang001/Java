package array_demo;

public class Prime_simple 
{

	public static void main(String[] args) 
	{
		int a[]= {15,17,19,21,23,25,27,29,45,89,62,45,71,337};
		
		int l=a.length; System.out.println(l); System.out.println();
		System.out.println("Array of a is "); 
		for (int x=0;x<l;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();System.out.println();
		
	// Prime program 	
		int flag=0;
		System.out.println("Prime numbers are as follows ↓ ");
		for (int i=0;i<l;i++)
		{
			for (int j=2;j<a[i];j++)
			{
				if (a[i]%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(a[i]+" ");
			}
			flag=0;	
		}

	}

}
