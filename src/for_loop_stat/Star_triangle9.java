package for_loop_stat;

public class Star_triangle9 
{

	public static void main(String[] args) 
	{
		int num=10;
		for (int a=1;a<=num;a++)
		{
			for (int i=2;i<=a;i++)
			{
				System.out.print(" ");
			}
			for (int b=(num*2)-1;b>=(a*2)-1;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
