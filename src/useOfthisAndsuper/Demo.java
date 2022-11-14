package useOfthisAndsuper;
//Subclass Variable
public class Demo extends Test
{

	int a=65;
	public void thiDemo()
	{
		int a=45;
		
		System.out.println("Value of Local variable "+a);
		System.out.println("Value of Local variable "+this.a);
		System.out.println("Value of Local variable "+super.a);

	}
	
	public static void main(String[] args) 
	{
		Demo obj= new Demo();
		obj.thiDemo();

	}

}
