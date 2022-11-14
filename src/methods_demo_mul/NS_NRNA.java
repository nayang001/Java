package methods_demo_mul;
//NON STATIC NO RETURN NO ARG
public class NS_NRNA 
{
	public void mul()
	{
		int a=121;
		int b=454;
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) 
	{
		NS_NRNA obj=new NS_NRNA();
		obj.mul();

	}

}
