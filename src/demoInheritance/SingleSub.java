package demoInheritance;

public class SingleSub extends SingleSuper
{
	int a=73;
	SingleSub()
	{
		super();
		System.out.println("Constructor of SingleSub Class");
	}
	
	void dog()
	{
		System.out.println("Puppy is also walking with Dog");
	}
	
	void call()
	{
		System.out.println(super.a);
		System.out.println(this.a);
		super.dog();
		this.dog();
	}

	public static void main(String[] args) 
	{
		SingleSub obj=new SingleSub();
		obj.call();
	}

}
