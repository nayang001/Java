package string;

public class Reverse 
{

	public static void main(String[] args) 
	{
		
		String a="Velocity";
		int l=a.length();
		System.out.println(a+" ←←← is a String and its length is →→→→ "+l);
		char x=a.charAt(1);
		System.out.println(x);
		
		System.out.println();
		
		String rev="";
		for (int i=l-1;i>=0;i--)
		{
			char b=a.charAt(i);
			rev=rev+b;
		}
		System.out.println("Original String is                →"+a);
		System.out.println("Reverse of the original String is →"+rev);
	}

}
