package methods_demo_sub;
//NON STATIC WITH RETURN WITH ARG
public class NS_WRWA 
{
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static void main(String[] args) 
	{
		NS_WRWA obj=new NS_WRWA();
		int x=obj.sub(943, 741);
		System.out.println("Sub is "+x);

	}

}
