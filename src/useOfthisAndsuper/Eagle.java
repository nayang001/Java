package useOfthisAndsuper;
//Subclass Constructor
public class Eagle extends Bird
{
	Eagle()
	{
		super();
		System.out.println("Eagle is flying.");
	}
	
	Eagle(String a)
	{
		super("Doing chores");
		System.out.println("Eagle is "+a);
	}
	
	public static void main(String[] args) 
	{
		Eagle cc=new Eagle();
		cc= new Eagle("doing work");
		
	}

}
