package methods_demo_mul;
//NON STATIC WITH RETURN WITH ARG
public class NS_WRWA 
{
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.print("Multiplication of "+a+" and "+b+" is ");
		return c;
	}

	public static void main(String[] args) 
	{
		NS_WRWA obj= new NS_WRWA();
		int z=obj.mul(15,45);
		System.out.println(z);

	}

}
