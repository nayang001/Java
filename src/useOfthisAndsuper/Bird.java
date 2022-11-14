package useOfthisAndsuper;

public class Bird 
{
	String a="Resting";
	Bird()
	{
		System.out.println("Bird is flying below Eagle");
	}
	Bird(String a)//
	{
		System.out.println("Bird is "+a);
	}
	public static void main(String[] args) 
	{
		Bird obj=new Bird();
		obj=new Bird("Doing Work");
		obj=new Bird("Doing chores");
	}
	
}
