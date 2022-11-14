package methods_demo_mul;
// STATIC WITH RETURN NO ARG
public class S_WRNA 
{
	public static int mul()
	{
		int a=16;
		int b=71;
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
		return a;
	}

	public static void main(String[] args) 
	{
		int z=S_WRNA.mul();
		System.out.println(z);
		

	}

}
