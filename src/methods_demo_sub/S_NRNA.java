package methods_demo_sub;
// STATIC NO RETURN NO ARG

public class S_NRNA 
{
	public static void sub()
	{
		int a=46;
		int b=36;
		int c=a-b;
		System.out.println("Sub is "+c);
	}

	public static void main(String[] args) 
	{
		S_NRNA.sub();
		S_NRNA obj=new S_NRNA();
		obj.sub();

	}

}
