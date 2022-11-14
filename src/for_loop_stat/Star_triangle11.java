package for_loop_stat;

public class Star_triangle11 
{

	public static void main(String[] args) 
	{
		int num=10;
		for (int a=1;a<=num;a++)
		{
			for (int i=num-1;i>=a;i--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=a;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=1;a<=num;a++)
		{
			
			for (int i=1;i<=a;i++)
			{
				System.out.print(" ");
			}
			for (int j=num-1;j>=a;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
