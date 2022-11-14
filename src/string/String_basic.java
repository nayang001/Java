package string;

public class String_basic 
{

	public static void main(String[] args) 
	{
		String a="Velocity";
		int l=a.length();
		System.out.println(a);
		System.out.println(l);
		
		String b=new String("Nayan");
		int s=b.length();
		System.out.println(b);
		System.out.println(s);
		
		String c=a+b;
		System.out.println(c);

	}

}
