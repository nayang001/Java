package accSpe;

public class MethodAccSpe 
{
	void add(int a,int b) //default package
	{
		int c=a+b;
		System.out.println("Addition is → "+c);
	}
	
	public void mul(int a,int b) //public project
	{
		int c=a*b;
		System.out.println("Multiplication is → "+c);
	}
	
	private void div(int a,int b) //private class
	{
		int c=a/b;
		System.out.println("Divison is → "+c);
	}

	protected void sub(int a,int b) //protected package
	{
		int c=a-b;
		System.out.println("Substraction is → "+c);
	}

	//Calling methods in same class
	public static void main(String[] args) 
	{
		MethodAccSpe obj= new MethodAccSpe();
		obj.add(48, 440); //default called
		obj.mul(21, 15);  //public called
		obj.div(15, 3);   //private called
		obj.sub(78, 10);  //protected called
	}

}
