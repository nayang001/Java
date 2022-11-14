package methods_demo_mul;
//NON STATIC WITH RETURN NO ARG
public class NS_WRNA 
{
	public int mul()
	{
		int a=29;
		int b=17;
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
		
		return a;
	}

	public static void main(String[] args) 
	{
		NS_WRNA obj=new NS_WRNA();
		int z=obj.mul();
		System.out.println(z);
	}

}
