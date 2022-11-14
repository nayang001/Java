package methodOverloading;

public class OverloadDemo 
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition is "+d);
	}

	
	public static void main(String[] args) 
	{
		OverloadDemo obj=new OverloadDemo();
		obj.add(45, 74);
		obj.add(45, 41,45);

	}

}
