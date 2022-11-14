package method_hard;

public class Starall1 
{
	public static void s()
	{
		int num=5;int a,b;
		for(a=1;a<=num;a++)
		{
			for (b=1;b<=num;b++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		} 	
	}
	
	public static void t15()
	{
		int a,b;
		for (a=1;a<=5;a++) 
		{
			for (b=1;b<=a;b++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void t51()
	{
		for (int a=1;a<=5;a++)
		{
			for (int b=5;b>=a;b--)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
	
	public static void t151()
	{
		int num=5;
		for (int a=1;a<=num;a++)
		{
			for (int i=1;i<=a;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=1;a<=num;a++)
		{
			for (int i=num-1;i>=a;i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void ts15()
	{
		int a,b,c;
		for (a=1;a<=5;a++)
		{
			for (b=4;b>=a;b--)
			{
				System.out.print("  ");
			}
			
			for (c=1;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void ts51()
	{
		int a,b,c;
		for (a=1;a<=5;a++)
		{
			for (b=2;b<=a;b++)
			{
				System.out.print("  ");
			}
			for (c=5;c>=a;c--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void ts151()
	{
		int num=5;
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
	
	public static void t19()
	{
		int num=5;
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
			for (int k=2;k<=a;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void t91()
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
	}
	
	public static void t191()
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
/// ALL TRIANGLES ARE CODED HERE BUT THERE IS NO MAIN METHOD
/// SO THIS METHODS ARE CALLED IN Starall_switch PROGRAMM