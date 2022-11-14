package methods_demo_mul;
// STATIC NO RETURN WITH ARG
public class S_NRWA 
{
	public static void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) 
	{
		S_NRWA.mul(13, 17);
	}

}
