package constructor_demo;

public class Prep 
{
	public Prep()
	{
		int a=5;
		int b=45;
		int c=a+b;
		System.out.println("Addition is → "+c);
		
	}
	protected Prep(int a)
	{
		int b=12;
		int c=a+b;
		System.out.println("Addition is → "+c);
	}
	protected Prep(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is → "+c);
	}
	protected Prep(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition is → "+d);
	}

	public static void main(String[] args) 
	{
		Prep obj=new Prep();
		obj= new Prep(45);
		obj= new Prep(45,16);

	}

}
