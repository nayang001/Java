package methods_demo_ADD;
//STATIC WITH RETURN WITH ARGUMENT

public class Add_S_WRWA 
{
	public static int Add(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		Add_S_WRWA.Add(15,96);
		int z=Add_S_WRWA.Add(24,96);
		System.out.println(z);

	}

}
