package methods_demo_ADD;
//NON STATIC WITH RETURN WITH ARGUMENT
public class Add_NS_WRWA 
{
	public int Add(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		Add_NS_WRWA obj=new Add_NS_WRWA();
		int z=obj.Add(45,13);
		System.out.println(z);
	}

}
