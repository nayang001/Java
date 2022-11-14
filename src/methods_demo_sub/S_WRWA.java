package methods_demo_sub;
//STATIC WITH RETURN WITH ARG

public class S_WRWA 
{
	public static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}

	public static void main(String[] args) 
	{
		int z=S_WRWA.sub(411, 63);
		System.out.println("Sub is "+z);;

	}

}
