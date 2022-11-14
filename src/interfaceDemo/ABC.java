package interfaceDemo;

public class ABC implements Bird
{
	public final String f="Fetching";
	public final String e="Eating";
	public final String h="Hunting";
	
	public void sparrow()
	{
		final String f="FFFFFFF";
		System.out.println("Sparrow is "+f);
		System.out.println("Sparrow is "+this.f);
		System.out.println("Sparrow is "+Bird.f);
	}
	
	public void eagle()
	{
		System.out.println("Eagle is "+e);
	}
	
	public void owl()
	{
		
		System.out.println("Owl is "+r+" and "+e);
	}
	
	public void duck()
	{
		System.out.println("Duck is "+s+" and "+h);
	}
	
	
	public static void main(String[] args) 
	{
		ABC abc=new ABC();
		abc.sparrow();
		abc.eagle();
		abc.owl();
		abc.duck();

	}

}
