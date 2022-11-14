package methodOR;

public class Super
{
	public final String f="Flying";
	public final String e="Eating";
	public final String h="Hunting";
	public String r;
	public String s;
	
	void sparrow()
	{
		System.out.println("Sparrow is "+f);
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
	
	void crow()
	{
		System.out.println("Crow is black,NIgga");
	}
	
	public static void main(String[] args) 
	{
		Super sup=new Super();
		Super sub=new Sub();
		sup.duck(); sub.duck();
		sup.sparrow(); // void methodOR.Super.sparrow()
		sub.sparrow(); // void methodOR.Super.sparrow()
		


		
		
	}
	
}
