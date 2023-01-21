package abstractDemo;

public class ConcreteClass extends AbstractClass 
{
	public void sub()
	{
		
		int x=45;
		int y=12;
		int z=x-y;
		System.out.println(z);
	}
	
	public void multi()
	{
		int p=45;
		int q=12;
		int r=p*q;
		System.out.println(r);
	}
	
	public void div()
	{
		int i=15;
		int j=5;
		int k=i/j;
	    System.out.println(k);
	}

	public static void main(String[] args) 
	{
		ConcreteClass obj=new ConcreteClass();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();

	}

}
