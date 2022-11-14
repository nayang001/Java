package methods_demo_ADD;
// NON STATIC NO RETURN WITH ARGUMENT
public class Add_NS_NRWA 
{
	public void Addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Add_NS_NRWA obj=new Add_NS_NRWA();
		obj.Addition(47,15);

	}

}
