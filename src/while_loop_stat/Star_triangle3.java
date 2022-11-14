package while_loop_stat;

public class Star_triangle3 
{

	public static void main(String[] args) 
	{
		int a=1;
		while (a<=5)
		{
			int b=4;
			while (b>=a)
			{
				System.out.print(" ");
				b--;
			}
			int c=1;
			while (c<=a)
			{
				System.out.print(" *");
				c++;
			}
			System.out.println();
			a++;		
		}
		

	}

}
