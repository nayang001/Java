package string;

public class Palindrome_string 
{

	public static void main(String[] args) 
	{
		String a="aBba";
		int s=a.length();
		System.out.println(a+" ←←← is a String and its length is →→→→ "+s);
		System.out.println();
		
		String rev="";
		for (int i=s-1;i>=0;i--)
		{
			char ch=a.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Original String is                →"+a);
		System.out.println("Reverse of the original String is →"+rev);
		System.out.println();
		
		if (a==(rev))
		{
			System.out.println("Given String is Palindrome ");
		}
		else
		{
			System.out.println("Given String is NOT Palindrome ");
		}

	}

}
