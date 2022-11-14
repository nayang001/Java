package dowhile_loop_stat;

public class Star_square 
{

	public static void main(String[] args) 
	{
		int a=1;
		do
		{
			int b=5;
			do
			{
				System.out.print(a);
				b--;
			}
			while (b>=a);
			System.out.println();
			a++;
		}
		while (a<=5); 

	}

}
