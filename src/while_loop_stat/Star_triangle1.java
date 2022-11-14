package while_loop_stat;

public class Star_triangle1 
{

	public static void main(String[] args) 
	{
		int a=1;
		while (a<=5)
		{
			int b=1;
			while (b<=a)
			{
				System.out.print(" *");
				b++;
			}
			System.out.println();
			a++;
		}
		
	}

}
