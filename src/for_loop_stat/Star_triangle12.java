package for_loop_stat;

public class Star_triangle12 
{

	public static void main(String[] args) 
	{
		int num=5;
		for (int a=1;a<=num;a++)
		{
			for (int i=2;i<=a;i++)
			{
				System.out.print(" ");
			}
			for (int j=num;j>=a;j--)
			{
				System.out.print("*");
			}
			for (int j=num-1;j>=a;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=2;a<=num;a++)
		{
			for (int i=num-1;i>=a;i--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=a;j++)
			{
				System.out.print("*");
			}
			for (int k=2;k<=a;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
