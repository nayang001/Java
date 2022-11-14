package while_loop_stat;

public class Reverseno_simple 
{

	public static void main(String[] args) 
	{
		int num=53698;
		int temp;
		int rev=0;
		while (num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);

	}

}
