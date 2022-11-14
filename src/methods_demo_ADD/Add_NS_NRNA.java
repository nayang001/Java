package methods_demo_ADD;
//NON STATIC NO RETURN NO ARGUMENT
public class Add_NS_NRNA 
{
	public void Addition()
	{
		int a=26;
		int b=48;
		int c=a+b;
		System.out.println("Addition is "+c);
	}

	public static void main(String[] args) 
	{
		Add_NS_NRNA obj=new Add_NS_NRNA();
		obj.Addition();
	}

}
