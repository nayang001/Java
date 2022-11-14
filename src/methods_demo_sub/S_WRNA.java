package methods_demo_sub;
// STATIC WITH RETURN NO ARG
public class S_WRNA 
{
	public static int sub()
	{
		int a=259;
		int b=173;
		int c=a-b;
		return c;
	}

	public static void main(String[] args) 
	{
		int z=S_WRNA.sub();
		System.out.println("Sub is "+z);

	}

}
