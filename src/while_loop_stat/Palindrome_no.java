package while_loop_stat;

public class Palindrome_no 
{

	public static void main(String[] args) 
	{
		int num=987789; int a=num;
		int temp;
		int rev=0;
		while (num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);
		if (a==rev)
		{
			System.out.println("Given value is Palindrome number");
		}
		else
		{
			System.out.println("Given value is NOT Palindrome number");
		}

	}

}
