package methodOR;

public class Sub extends Super
{
	public final String f="Fetching";
	public final String e="EEEEEE";
	public final String h="HHHHHH";
	
	void sparrow()
	{
		final String f="FFFFFFF";
		System.out.println("Sparrow is "+f);
		System.out.println("Sparrow is "+this.f);
		System.out.println("Sparrow is "+super.f);
	}
	
	void eagle()
	{
		System.out.println("Eagle is "+e);
	}
	
	void owl()
	{
		r="Resting";
		System.out.println("Owl is "+r+" and "+e);
	}
	
	void duck()
	{
		s="Swimming";
		System.out.println("Duck is "+s+" and "+h);
	}
	
	public static void main(String[] args) 
	{
		Sub obj=new Sub();
		obj.sparrow();
		obj.owl();
		Super bb=new Sub(); //Up casting
		bb.sparrow();
		bb.crow();
	}

}
