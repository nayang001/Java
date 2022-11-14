package array_demo;

public class Large_Small_no 
{

	public static void main(String[] args) 
	{
		int a[]= {4,5,6,1,2,9,8,0,78,78,7,3};
		int l=a.length;  System.out.println("Size of an ARRAY →"+l);
		int flag=0; int temp=0;
		for (int i=0;i<l;i++)
		{
			for (int j=0;j<l;j++)
			{	
				if (a[i]>=a[j])
				{
					flag++;
				}
				if (a[i]<=a[j])
				{	
					temp++;	
				}	
			}
			if (flag==l)
			{
				System.out.println("Biggest no is →"+a[i]);
			}
			if (temp==l)
			{
				System.out.println("Smallest no is →"+a[i]);
			}
			flag=0; temp=0;
		}

	}

}
