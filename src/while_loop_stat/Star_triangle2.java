package while_loop_stat;

public class Star_triangle2 
{

	public static void main(String[] args) 
	{
		int a=1;
		while (a<=5)
		{
			int b=5;
			while (b>=a)
			{
				System.out.print(" *");
				b--;		
			}
			a++;
			System.out.println();
		}
	}

}
