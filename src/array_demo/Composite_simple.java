package array_demo;

public class Composite_simple 
{

	public static void main(String[] args) 
	{
		int[] a= {6,7,8,11,12,13,15,17,18,19,21,23,26,30,37};
		int l=a.length; System.out.println(l);
		int flag=0;
		for (int i=0; i<l; i++)
		{
			for (int x=2; x<a[i] ; x++)
			{
				if (a[i]%x==0)
				{
					flag++;
				}
				if(flag>0)
				{
					System.out.println(a[i]+" is Composite");
					flag--;
					break;	
				}
				
			}
			
		}

	}

}
