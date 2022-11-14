package methods_demo_sub;
//NON STATIC NO RETURN WITH ARG

public class NS_NRWA 
{
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Sub is "+c);
	}

	public static void main(String[] args) 
	{
		NS_NRWA obj=new NS_NRWA();
		obj.sub(45, 21);
		
		int i=278,j=145;
		obj.sub(i, j);

	}

}
