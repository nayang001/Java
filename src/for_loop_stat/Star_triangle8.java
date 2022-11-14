package for_loop_stat;

public class Star_triangle8 
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
			for (int b=1;b<a*2;b++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
