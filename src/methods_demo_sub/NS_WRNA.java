package methods_demo_sub;
//NON STATIC WITH RETURN NO ARG
public class NS_WRNA 
{
	public int sub()
	{
		int a=66;
		int b=15;
		int c=a-b;
		return c;
	}

	public static void main(String[] args) 
	{
		NS_WRNA obj=new NS_WRNA();
		int z=obj.sub();
		System.out.println("Sub is "+z);
		

	}

}
