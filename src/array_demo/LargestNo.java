package array_demo;

public class LargestNo 
{

	public static void main(String[] args) 
	{
		int a[]= {45,56,1236,98,201,1236,125,302,303,309,456};
		int l=a.length;  System.out.println("Size of an ARRAY →"+l);
		int flag=0;
		for (int i=0;i<l;i++)
		{
			for (int j=0;j<l;j++)
			{	
				if (a[i]>=a[j])
				{
					flag++;	
				}	
			}
			if (flag==l)
			{
				System.out.println("Biggest no is →"+a[i]);
				break;
			}
			flag=0;
		}
	}

}
