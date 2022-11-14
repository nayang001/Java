package methods_demo_ADD;
//NON STATIC WITH RETURN NO ARGUMENT
public class Add_NS_WRNA 
{
	public int Add()
	{
		int a=2;
		int b=98;
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		Add_NS_WRNA obj=new Add_NS_WRNA(); //Object creation
		obj.Add();                         //CAlling method using object
		int z=obj.Add();
		System.out.println(z);
	}

}
