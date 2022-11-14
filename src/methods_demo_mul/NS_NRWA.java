package methods_demo_mul;
//NON STATIC NO RETURN WITH ARG
public class NS_NRWA 
{
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) 
	{
		NS_NRWA obj=new NS_NRWA();
		obj.mul(15, 12);

	}

}
