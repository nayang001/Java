package for_loop_stat;

public class Star_triangle5 
{

	public static void main(String[] args) 
	{
		int a,b,c=5,d=1,x;
		for(a=1;a<=3;a++)
		{
			for (x=2; x<=a;x++)
			{
				System.out.print(" ");
			}
			for (b=d;b<=c;b++)
			{
				System.out.print("*");
			}
			c--;d++;
			System.out.println();
		}
		int p,q,r=3;
		
		System.out.print(" ");
		for (p=1;p<=2;p++)
		{
			for (q=1;q<=r;q++)
			{
				System.out.print("*");
			}
			r+=2;
			System.out.println();
		}
	}

}
