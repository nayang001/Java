package methods_demo_sub;
//NON STATIC NO RETURN NO ARG
public class NS_NRNA 
{
	public void sub()
	{
		int a=55;
		int b=12;
		int c=a-b;
		System.out.println("Sub is "+c);
	}
	

	public static void main(String[] args) 
	{
		NS_NRNA obj=new NS_NRNA();
		obj.sub();	
	}

}
