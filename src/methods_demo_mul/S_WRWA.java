package methods_demo_mul;
//NON STATIC WITH RETURN WITH ARG
public class S_WRWA 
{
	public static int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is ");
		return c;
	}

	public static void main(String[] args) 
	{
		int z=S_WRWA.mul(54, 12);
		System.out.println(z);
		

	}

}
